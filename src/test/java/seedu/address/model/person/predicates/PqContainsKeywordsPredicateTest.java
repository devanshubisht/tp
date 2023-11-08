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

public class PqContainsKeywordsPredicateTest {

    @Test
    public void equals() {
        List<String> firstPredicateKeywordList = Collections.singletonList("first");
        List<String> secondPredicateKeywordList = Arrays.asList("first", "second");

        PqContainsKeywordsPredicate firstPredicate = new PqContainsKeywordsPredicate(firstPredicateKeywordList);
        PqContainsKeywordsPredicate secondPredicate = new PqContainsKeywordsPredicate(secondPredicateKeywordList);

        // same object -> returns true
        assertTrue(firstPredicate.equals(firstPredicate));

        // same values -> returns true
        PqContainsKeywordsPredicate firstPredicateCopy = new PqContainsKeywordsPredicate(firstPredicateKeywordList);
        assertTrue(firstPredicate.equals(firstPredicateCopy));

        // different types -> returns false
        assertFalse(firstPredicate.equals(1));

        // null -> returns false
        assertFalse(firstPredicate.equals(null));

        // different person -> returns false
        assertFalse(firstPredicate.equals(secondPredicate));
    }

    @Test
    public void test_pqContainsKeywords_returnsTrue() {
        // One keyword
        PqContainsKeywordsPredicate predicate = new PqContainsKeywordsPredicate(Collections.singletonList("how"));
        assertTrue(predicate.test(TypicalStudents.BOB));

        // Mixed-case keywords
        predicate = new PqContainsKeywordsPredicate(Arrays.asList("HOW"));
        assertTrue(predicate.test(new StudentBuilder().withName(StudentBuilder.DEFAULT_NAME)
                .withPendingQuestion("how").withTag(StudentBuilder.DEFAULT_STUDENT_RANK).build()));
    }

    @Test
    public void test_pqDoesNotContainKeywords_returnsFalse() {
        
        PqContainsKeywordsPredicate predicate;

        // Only one matching keyword does not find
        predicate = new PqContainsKeywordsPredicate(Arrays.asList("how", "9"));
        assertFalse(predicate.test(TypicalStudents.BOB));

        // Non-matching keyword
        predicate = new PqContainsKeywordsPredicate(Arrays.asList("she"));
        assertFalse(predicate.test(new StudentBuilder().withPendingQuestion("her").build()));

        // Keywords match tag, name, but does not match pq
        predicate = new PqContainsKeywordsPredicate(Arrays.asList("GOOD", StudentBuilder.DEFAULT_NAME));
        assertFalse(predicate.test(new StudentBuilder().withName(StudentBuilder.DEFAULT_NAME)
                .withPendingQuestion("Not fine")
                .withTag(StudentRank.GOOD).build()));
    }

    @Test
    public void toStringMethod() {
        List<String> keywords = List.of("keyword1", "keyword2");
        PqContainsKeywordsPredicate predicate = new PqContainsKeywordsPredicate(keywords);

        String expected = PqContainsKeywordsPredicate.class.getCanonicalName() + "{keywords=" + keywords + "}";
        assertEquals(expected, predicate.toString());
    }
}
