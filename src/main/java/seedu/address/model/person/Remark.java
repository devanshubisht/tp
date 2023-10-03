package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's remark in the address book.
 * Guarantees: immutable; is always valid
 */
public class Remark {
    /**
     * The remark value.
     */
    public final String value;

    /**
     * Constructs a {@code Remark}.
     * @param remark A valid remark.
     */
    public Remark(String remark) {
        requireNonNull(remark);
        value = remark;
    }

    /**
     * Returns true if this remark is equal to another object.
     * Two remarks are considered equal if they have the same value.
     * @param other The object to compare this remark with.
     * @return True if the remarks are equal, false otherwise.
     */
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        Remark remark = (Remark) other;
        return value.equals(remark.value);
    }

    /**
     * Returns the hashcode of this remark.
     * @return The hashcode of this remark.
     */
    @Override
    public int hashCode() {
        return value.hashCode();
    }

    /**
     * Returns the remark value as a String.
     * @return The remark value.
     */
    @Override
    public String toString() {
        return value;
    }
}
