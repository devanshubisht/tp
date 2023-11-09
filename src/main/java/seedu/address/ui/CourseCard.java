package seedu.address.ui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.Region;
import seedu.address.model.course.Course;


/**
 * A UI component that displays information of a {@code Course}.
 */
public class CourseCard extends UiPart<Region> {

    private static final String FXML = "CourseListCard.fxml";

    public final Course course;

    @FXML
    private HBox cardPane;
    @FXML
    private Label courseName;
    @FXML
    private Label classSize;
    @FXML
    private Label goodTagCount;
    @FXML
    private Label averageTagCount;
    @FXML
    private Label poorTagCount;
    @FXML
    private Label pqCount;
    @FXML
    private Label id;
    @FXML
    private Pane coursePQPane;

    /**
     * Creates a {@code StudentCode} with the given {@code Student} and index to display.
     */
    public CourseCard(Course course, int displayedIndex, boolean fade, boolean highlight) {
        super(FXML);
        this.course = course;
        id.setText(displayedIndex + ". ");
        courseName.setText(course.getCourseName().fullCourseName);
        if (fade) {
            fadeCourse();
        }
        if (highlight) {
            highlightCourse();
        }
        classSize.setText("Students: " + course.getCourseSize());
        pqCount.setText("Pending Questions: " + course.getPendingQuestionCount());
        if (course.getPendingQuestionCount() == 0) {
            coursePQPane.setOpacity(0.3);
        }
        goodTagCount.setText(Integer.toString(course.getGoodTagCount()));
        averageTagCount.setText(Integer.toString(course.getAverageTagCount()));
        poorTagCount.setText(Integer.toString(course.getPoorTagCount()));
    }

    private void fadeCourse() {
        cardPane.setOpacity(0.3);
    }

    private void highlightCourse() {
        courseName.setStyle("-fx-text-fill: turquoise ");
        id.setStyle("-fx-text-fill: paleturquoise");
    }
}
