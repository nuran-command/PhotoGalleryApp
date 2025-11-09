import com.project.filters.base.BasicImage;
import com.project.filters.base.Image;
import com.project.filters.factory.FilterFactory;

public class Main {
    public static void main(String[] args) {
        Image img = new BasicImage();
        img = FilterFactory.applyFilter("grayscale", img);
        img.display();
    }
}