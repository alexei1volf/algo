package charrepetitioncounter;

public class CharRepetitionCounter {

    public String getNumberOfRepetitions(String str) {

        StringBuilder sb = new StringBuilder();

        int counter = 1;
        char[] chars = str.toCharArray();

        for (int i = 0; i <= chars.length; i++) {

            if (chars[i] < 'A' || chars[i] > 'Z') {
                throw new RuntimeException("should be A-Z");
            }

            char current = chars[i];

            if (i == chars.length - 1) {
                sb.append(current);
                sb.append(counter);
                break;
            }

            char next = chars[i + 1];

            if (current == next) {
                counter += 1;
            } else {
                if (counter > 1) {
                    sb.append(current);
                    sb.append(counter);
                } else {
                    sb.append(current);
                }
                counter = 1;
            }
        }

        return sb.toString();

    }
}
