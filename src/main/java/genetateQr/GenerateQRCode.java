package genetateQr;

import com.google.zxing.*;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Dilshodbek Akhmedov, Wed 11:59. 27/07/22
 */
public class GenerateQRCode {

    //static function that creates QR Code
    public static void generateQRCode(String data, String path, String charset, Map map, int h, int w) throws WriterException, IOException {

        //the BitMatrix class represents the 2D matrix of bits
        BitMatrix matrix = new MultiFormatWriter().encode(new String(data.getBytes(charset), charset), BarcodeFormat.QR_CODE, w, h);

        //MultiFormatWriter is a factory class that finds the appropriate Writer subclass for the BarcodeFormat requested and encodes the barcode with the supplied contents.
        MatrixToImageWriter.writeToFile(matrix, path.substring(path.lastIndexOf('.') + 1), new File(path));
    }


    //main() method
    public static void main(String[] args) throws WriterException, IOException, NotFoundException {

        //data that we want to store in the QR code
        String str = "9860080112972197";

        //path where we want to get QR Code
        String path = "/home/dilshodbek/Desktop/SOAP/Test/src/main/resources/Quote" + System.currentTimeMillis() + ".png";

        //Encoding charset to be used
        String charset = "UTF-8";
        Map<EncodeHintType, ErrorCorrectionLevel> hashMap = new HashMap<>();

        //generates QR code with Low level(L) error correction capability
        hashMap.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);

        //invoking the user-defined method that creates the QR code
        generateQRCode(str, path, charset, hashMap, 420, 420);
        //increase or decrease height and width accodingly
        //prints if the QR code is generated
        System.out.println("QR Code created successfully.");
    }
}