package stpe2;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * Created by jojoldu@gmail.com on 2017-02-04.
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */

public class StringCalculator {
    public int add(String text){
        if(text == null || text.isEmpty()){
            return 0;
        }

        return sum(toPositiveStream(split(text)));
    }

    public String[] split(String text) {
        String[] customResult = customSplit(text);

        if(customResult.length > 1){
            return customResult;
        }

        return text.split(",|:");
    }

    private String[] customSplit(String text){
        Matcher matcher = Pattern.compile("//(.)\n(.*)").matcher(text);
        if(matcher.find()){
            String custom = matcher.group(1);
            return matcher.group(2).split(custom);
        }

        return new String[]{text};
    }

    public Stream<Integer> toPositiveStream(String[] numbers){
        return Arrays
                .stream(numbers)
                .map(Integer::parseInt);
    }

    public int sum(Stream<Integer> stream){
        return stream
                .mapToInt(number -> {
                    if(number < 0){
                        throw new RuntimeException();
                    }

                    return number;
                })
                .sum();
    }
}
