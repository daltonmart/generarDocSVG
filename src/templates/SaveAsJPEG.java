/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package templates;

import java.io.*;

import org.apache.batik.transcoder.image.JPEGTranscoder;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;

public class SaveAsJPEG {

    public static void main(String[] args) throws Exception {

        // Create a JPEG transcoder
        JPEGTranscoder t = new JPEGTranscoder();

        // Set the transcoding hints.
        t.addTranscodingHint(JPEGTranscoder.KEY_QUALITY,
                   new Float(.8));
        String archivo = "src/Diploma_1(Dalton MARTÍNEZ).svg";

        // Create the transcoder input.
        String svgURI = new File(archivo).toURL().toString();
        TranscoderInput input = new TranscoderInput(svgURI);

        // Create the transcoder output.
        OutputStream ostream = new FileOutputStream("out.jpg");
        TranscoderOutput output = new TranscoderOutput(ostream);

        // Save the image.
        t.transcode(input, output);

        // Flush and close the stream.
        ostream.flush();
        ostream.close();
        System.exit(0);
    }
}