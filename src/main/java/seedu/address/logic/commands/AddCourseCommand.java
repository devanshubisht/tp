package seedu.address.logic.commands;

import static java.util.Objects.requireNonNull;
import static seedu.address.logic.parser.CliSyntax.PREFIX_COURSE_NAME;

import seedu.address.commons.util.ToStringBuilder;
import seedu.address.logic.Messages;
import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;
import seedu.address.model.course.Course;

/**
 * Adds a course to the course list.
 */
public class AddCourseCommand extends Command {

    public static final String COMMAND_WORD = "add";

    public static final String MESSAGE_USAGE = COMMAND_WORD + ": Adds a course to the course list. "
            + "Parameters: "
            + PREFIX_COURSE_NAME + "COURSE_NAME ";


    public static final String MESSAGE_SUCCESS = "New course added: %1$s";
    public static final String MESSAGE_DUPLICATE_COURSE = "This course already exists in the course list.";

    private final Course toAdd;

    /**
     * Creates an AddCourseCommand to add the specified {@code Course}
     */
    public AddCourseCommand(Course course) {
        requireNonNull(course);
        toAdd = course;
    }

    @Override
    public CommandResult execute(Model model) throws CommandException {
        requireNonNull(model);

        if (model.hasCourse(toAdd)) {
            throw new CommandException(MESSAGE_DUPLICATE_COURSE);
        }

        model.addCourse(toAdd);
        return new CommandResult(String.format(MESSAGE_SUCCESS, Messages.format(toAdd)));
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        // instanceof handles nulls
        if (!(other instanceof AddCourseCommand)) {
            return false;
        }

        AddCourseCommand otherAddCourseCommand = (AddCourseCommand) other;
        return toAdd.equals(otherAddCourseCommand.toAdd);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .add("toAdd", toAdd)
                .toString();
    }
}
