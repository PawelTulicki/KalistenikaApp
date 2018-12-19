package com.example.pawel.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class GalleryActivity extends AppCompatActivity {

    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
    private static final int PICK_IMAGE = 100;
    private static final int PICK_IMAGE2 = 101;
    private static final int PICK_IMAGE3 = 102;
    private static final int PICK_IMAGE4 = 103;
    Uri imageUri1;
    Uri imageUri2;
    Uri imageUri3;
    Uri imageUri4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Galeria");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image3 = findViewById(R.id.image3);
        image4 = findViewById(R.id.image4);


        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGalery(PICK_IMAGE);
            }
        });

        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGalery(PICK_IMAGE2);
            }
        });

        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGalery(PICK_IMAGE3);
            }
        });

        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGalery(PICK_IMAGE4);
            }
        });
    }

//    private void openGalery(){
//        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
//        startActivityForResult(gallery, PICK_IMAGE);
//    }
//
//    private void openGalery2(){
//        Intent gallery2 = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
//        startActivityForResult(gallery2, PICK_IMAGE2);
//    }

    private void openGalery(int requestCode) {
        Intent gallery = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.INTERNAL_CONTENT_URI);
        startActivityForResult(gallery, requestCode);
    }



    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE){
            imageUri1 = data.getData();
            if (imageUri1 != null) {
                saveToInternalStorage(imageUri1, "1.jpg");
            }
            image1.setImageURI(imageUri1);
        }
        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE2){
            imageUri2 = data.getData();
            if (imageUri2 != null) {
                saveToInternalStorage(imageUri2, "2.jpg");
            }
            image2.setImageURI(imageUri2);
        }

        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE3){
            imageUri3 = data.getData();
            if (imageUri3 != null) {
                saveToInternalStorage(imageUri3, "3.jpg");
            }
            image3.setImageURI(imageUri3);
        }

        if(resultCode == RESULT_OK && requestCode == PICK_IMAGE4){
            imageUri4 = data.getData();
            if (imageUri4 != null) {
                saveToInternalStorage(imageUri4, "4.jpg");
            }
            image4.setImageURI(imageUri4);
        }
    }

//    private void save(Uri uri, String outputFile) {
//        File input = null;
//        try {
//            input = new File(new URI(uri.toString()));
//        } catch (URISyntaxException e) {
//            e.printStackTrace();
//        }
//        if (input != null && input.exists()) {
//            Bitmap bmp = BitmapFactory.decodeFile(input.toString());
//
//            File file = new File(getFilesDir(), outputFile);
//            try {
//                file.createNewFile();
//                FileOutputStream fos = new FileOutputStream(file);
//                bmp.compress(Bitmap.CompressFormat.JPEG, 90, fos);
//
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        } else {
//            System.err.println("Plik nie istnieje!");
//            Log.e("Nazwa taga", "File nie istnieje!");
//        }
//    }


    private void saveToInternalStorage(Uri inputUri, String outputFile) {
        File inputFile = new File(inputUri.toString());
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream(inputFile);
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);

            File file = new File(getFilesDir(), outputFile);
            boolean success = file.createNewFile();
            if (success) {
                fos = new FileOutputStream(file);
                fos.write(buffer);
                fos.flush();
            } else {
                Toast.makeText(this, "Nie udało się stworzyć pliku w pamięci aplikacji", Toast.LENGTH_SHORT).show();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}
