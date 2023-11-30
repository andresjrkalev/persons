package ee.persons.utility;

import static ee.persons.common.Constants.PATTERN_QUERY_LIKE;

public class QueryUtility {
    public static String createLike(String value) {
        return String.format(PATTERN_QUERY_LIKE, value);
    }
}
