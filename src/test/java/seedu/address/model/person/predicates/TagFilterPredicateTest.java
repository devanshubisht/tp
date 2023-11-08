package seedu.address.model.person.predicates;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import seedu.address.model.tag.StudentRank;
import seedu.address.testutil.StudentBuilder;
import seedu.address.testutil.TypicalStudents;

public class TagFilterPredicateTest {

    @Test
    public void equals() {
        List<String> firstPredicateKeywordList = Collections.singletonList("first");
        List<String> secondPredicateKeywordList = Arrays.asList("first", "second");

        TagFilterPredicate firstPredicate = new TagFilterPredicate(firstPredicateKeywordList);
        TagFilterPredicate secondPredicate = new TagFilterPredicate(secondPredicateKeywordList);

        // same object -> returns true
        assertTrue(firstPredicate.equals(firstPredicate));

        // same values -> returns true
        TagFilterPredicate firstPredicateCopy = new TagFilterPredicate(firstPredicateKeywordList);
        assertTrue(firstPredicate.equals(firstPredicateCopy));

        // different types -> returns false
        assertFalse(firstPredicate.equals(1));

        // null -> returns false
        assertFalse(firstPredicate.equals(null));

        // different person -> returns false
        assertFalse(firstPredicate.equals(secondPredicate));
    }

    @Test
    public void test_tagContainsKeywords_returnsTrue() {
        // One keyword
        TagFilterPredicate predicate = new TagFilterPredicate(Collections.singletonList(StudentRank.POOR.toString()));
        assertTrue(predicate.test(TypicalStudents.BOB));

        // Mixed-case keywords
        predicate = new TagFilterPredicate(Arrays.asList("goOd"));
        assertTrue(predicate.test(new StudentBuilder().withName(StudentBuilder.DEFAULT_NAME)
                .withTag(StudentBuilder.DEFAULT_STUDENT_RANK).build()));
    }

    @Test
    public void test_tagDoesNotContainKeywords_returnsFalse() {
        
        TagFilterPredicate predicate;

        // Only one matching keyword does not find
        predicate = new TagFilterPredicate(Arrays.asList("how", "9"));
        assertFalse(predicate.test(TypicalStudents.BOB));

        // Non-matching keyword
        predicate = new TagFilterPredicate(Arrays.asList(StudentRank.GOOD.toString()));
        assertFalse(predicate.test(new StudentBuilder().withTag(StudentRank.POOR).build()));

        // Keywords match email, name, but does not match tag
        predicate = new TagFilterPredicate(Arrays.asList(StudentBuilder.DEFAULT_EMAIL, StudentBuilder.DEFAULT_NAME));
        assertFalse(predicate.test(new StudentBuilder().withName(StudentBuilder.DEFAULT_NAME)
                .withEmail(StudentBuilder.DEFAULT_EMAIL)
                .withTag(StudentRank.GOOD).build()));
    }

    @Test
    public void toStringMethod() {
        List<String> keywords = List.of("keyword1", "keyword2");
        TagFilterPredicate predicate = new TagFilterPredicate(keywords);

        String expected = TagFilterPredicate.class.getCanonicalName() + "{keywords=" + keywords + "}";
        assertEquals(expected, predicate.toString());
    }
}
