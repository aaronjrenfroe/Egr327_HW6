/**
 * Created by AaronR on 10/3/17.
 * for ?
 */

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class jarTesting2 {
    @Test
    public void reverse() throws Exception {
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.reverse(s).equals(sb.reverse().toString()));
        s = "abcdef";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.reverse(s).equals(sb.reverse().toString()));
        s = "123456789";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.reverse(s).equals(sb.reverse().toString()));
        s = "          ";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.reverse(s).equals(sb.reverse().toString()));
        s = "abcdefghijklmnopqrstuvwxyz";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.reverse(s).equals(sb.reverse().toString()));
    }

    @Test
    public void isPalindrome() throws Exception {
        String s = "";
        StringBuilder sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.isPalindrome(s) == (sb.reverse().toString().equals(s)));
        s = "abcdef";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.isPalindrome(s) == (sb.reverse().toString().equals(s)));
        s = "123456789";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.isPalindrome(s) == (sb.reverse().toString().equals(s)));
        s = "          ";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.isPalindrome(s) == (sb.reverse().toString().equals(s)));
        s = "abcdefghijklmnopqrstuvwxyz";
        sb = new StringBuilder(s);
        Assert.assertTrue(MyStringUtils.isPalindrome(s) == (sb.reverse().toString().equals(s)));
    }

    @Test
    public void countOfVowels() throws Exception {
        List<String> strings = new ArrayList();
        List<Integer> vowelCounts = new ArrayList();

        strings.add("abcdef");
        vowelCounts.add(2);

        strings.add("123456789");
        vowelCounts.add(0);
        strings.add("          ");
        vowelCounts.add(0);
        strings.add("abcdefghijklmnopqrstuvwxyz");
        vowelCounts.add(5);
        strings.add("aeiou");
        vowelCounts.add(5);
        strings.add("bcdfghjklmnpqrstvwxyz");
        vowelCounts.add(0);
        strings.add("");
        vowelCounts.add(0);

        for (int i = 0; i < strings.size(); i++) {
            Assert.assertTrue(vowelCounts.get(i) == MyStringUtils.countOfVowels(strings.get(i)));
        }


    }

    @Test
    public void oddContains() throws Exception {
        List<String> strings = new ArrayList();
        List<String> substrings = new ArrayList<>();
        List<Boolean> expected = new ArrayList();


        strings.add("abcdefg");
        substrings.add("aceg");
        expected.add(true);

        strings.add("abcdefghij");
        substrings.add("aceg");
        expected.add(true);

        strings.add("abcdefg");
        substrings.add("ab");
        expected.add(false);

        strings.add("taebscldaefg");
        substrings.add("tesla");
        expected.add(true);

        strings.add("haebicsdreifsgehni");
        substrings.add("heisrisen");
        expected.add(true);

        strings.add("haebicsdreifsgehni");
        substrings.add("ridi");
        expected.add(false);


        for (int i = 0; i < strings.size(); i++) {
            boolean result = expected.get(i) == MyStringUtils.oddContains(strings.get(i).toLowerCase(), substrings.get(i).toLowerCase());

            Assert.assertTrue("Did not find " + substrings.get(i) + " in " + strings.get(i),result);

        }
    }
}
