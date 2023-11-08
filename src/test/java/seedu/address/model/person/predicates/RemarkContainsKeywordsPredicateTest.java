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

public class RemarkContainsKeywordsPredicateTest {

    @Test
    public void equals() {
        List<String> firstPredicateKeywordList = Collections.singletonList("first");
        List<String> secondPredicateKeywordList = Arrays.asList("first", "second");

        RemarkContainsKeywordsPredicate firstPredicate = new RemarkContainsKeywordsPredicate(firstPredicateKeywordList);
        RemarkContainsKeywordsPredicate secondPredicate = new RemarkContainsKeywordsPredicate(secondPredicateKeywordList);

        // same object -> returns true
        assertTrue(firstPredicate.equals(firstPredicate));

        // same values -> returns true
        RemarkContainsKeywordsPredicate firstPredicateCopy = new RemarkContainsKeywordsPredicate(firstPredicateKeywordList);
        assertTrue(firstPredicate.equals(firstPredicateCopy));

        // different types -> returns false
        assertFalse(firstPredicate.equals(1));

        // null -> returns false
        assertFalse(firstPredicate.equals(null));

        // different person -> returns false
        assertFalse(firstPredicate.equals(secondPredicate));
    }

    @Test
    public void test_remarkContainsKeywords_returnsTrue() {
        // One keyword
        RemarkContainsKeywordsPredicate predicate = new RemarkContainsKeywordsPredicate(Collections.singletonList("aardvarks"));
        assertTrue(predicate.test(TypicalStudents.ALICE));

        // Mixed-case keywords
        predicate = new RemarkContainsKeywordsPredicate(Arrays.asList("AArdvarks"));
        assertTrue(predicate.test(new StudentBuilder().withName(StudentBuilder.DEFAULT_NAME)
                .withRemark("aardvarks").withTag(StudentBuilder.DEFAULT_STUDENT_RANK).build()));
    }

    @Test
    public void test_remarkDoesNotContainKeywords_returnsFalse() {
        
        RemarkContainsKeywordsPredicate predicate;

        // Only one matching keyword does not find
        predicate = new RemarkContainsKeywordsPredicate(Arrays.asList("she", "hates"));
        assertFalse(predicate.test(TypicalStudents.ALICE));

        // Non-matching keyword
        predicate = new RemarkContainsKeywordsPredicate(Arrays.asList("she"));
        assertFalse(predicate.test(new StudentBuilder().withRemark("her").build()));

        // Keywords match tag, name, but does not match remark
        predicate = new RemarkContainsKeywordsPredicate(Arrays.asList("GOOD", StudentBuilder.DEFAULT_NAME));
        assertFalse(predicate.test(new StudentBuilder().withName(StudentBuilder.DEFAULT_NAME)
                .withRemark("Not fine")
                .withTag(StudentRank.GOOD).build()));
    }

    @Test
    public void toStringMethod() {
        List<String> keywords = List.of("keyword1", "keyword2");
        RemarkContainsKeywordsPredicate predicate = new RemarkContainsKeywordsPredicate(keywords);

        String expected = RemarkContainsKeywordsPredicate.class.getCanonicalName() + "{keywords=" + keywords + "}";
        assertEquals(expected, predicate.toString());
    }
}
