package view;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import java.util.Random;

import javax.faces.event.ActionEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.dss.dataView.ViewController;

import org.apache.myfaces.trinidad.model.UploadedFile;



// farmer image uploading


public class FileManaging {
    private RichInputText db_Image_Value;

    public FileManaging() {
    }

    private UploadedFile file;
    private static String UniFileName;

    public void setFile(UploadedFile file) {
        this.file = file;
    }

    public UploadedFile getFile() {
        return file;
    }

    public void UploadFarmerImage(ActionEvent actionEvent) {
        // Add event code here...
        UploadedFile myfile = this.getFile();
        String path = null;

        if (myfile == null) {
            System.out.println("got no file");
        } else {
            // All uploaded files will be stored in below path
            UniFileName = (getRandomInteger(100000, 1000000)) + myfile.getFilename();
            path = "C://Meta_Data//CloudEMFP_Data//farmerImages//" + UniFileName;

            db_Image_Value.setValue(UniFileName);
            
//            System.out.println("oooooooooooooooo");
//            System.out.println(UniFileName);
//            System.out.println("oooooooooooooooo");
//            System.out.println("oooooooooooooooo");
//            System.out.println(path);
//            System.out.println("oooooooooooooooo");


            InputStream inputStream = null;
            try {
                FileOutputStream out = new FileOutputStream(path);
                inputStream = myfile.getInputStream();
                byte[] buffer = new byte[8192];
                int bytesRead = 0;
                while ((bytesRead = inputStream.read(buffer, 0, 8192)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
                out.flush();
                out.close();
            } catch (Exception ex) {
                // handle exception
                ex.printStackTrace();
            } finally {
                try {
                    inputStream.close();
                } catch (IOException e) {
                }
            }
        }
    }


    public static String getRandomInteger(int min, int max) {
        Random r = new Random();
        int ii = r.nextInt(100000 - 50000) + 50000;
        String genNumber = Integer.toString(ii);
        System.out.println(genNumber);

        return genNumber;
    }


    public void setDb_Image_Value(RichInputText db_Image_Value) {
        this.db_Image_Value = db_Image_Value;
    }

    public RichInputText getDb_Image_Value() {
        return db_Image_Value;
    }
}
