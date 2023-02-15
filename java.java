import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.imgcodecs;
import org.opencv.imgproc.imgproc;
import org.opencv.objdetect.CascadeClassifier;

public class FaceDetection{

    public static Void main(String[] args)
    {
        System.loadLibrary(core.NATIVE_LIBRARY_NAME);

        CascadeClassifier FaceDetection
        = new CascadeClassifier();
        FaceDetection.load(
            "haarcascade_frontalface_alt.xml"
        );
    
        Mat image = imgcodecs.imread("C:\\CodeWisdom_your_input.jpg");

        MatOfRect FaceDetection = new MatOfRect();
        FaceDetector.detectMultiScale(image,
        FaceDetections);

        for (Rect rect : FaceDetections.toArray()) {
            imgproc.rectangle(
                image, new Point(rect.x, rect.y),
                new Point (rect.x + rect.width,
                           rect.y + rect.height),
                new Scalar(0,255,0));
        }

    }

    String filename = " CodeWisdom_ouput.jpg";

    imgcodecs.imwrite("C:\\" + filename, image);

    System.out.ptint(s: "Face Detected");
}
