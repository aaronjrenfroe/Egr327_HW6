import org.junit.Assert;import org.junit.Test;/** * Created by Richard on 10/3/2017. */public class HW6{    @Test    public void reverse() throws Exception    {        String thing = "thing";        String reversed = "gniht";        String nextThing = MyStringUtils.reverse(thing);        Assert.assertEquals("not reversed",reversed,  nextThing);    }    @Test    public void isPalindrome() throws Exception    {        String noon = "noon";        Boolean checkResult = MyStringUtils.isPalindrome(noon);        Assert.assertEquals("not a pal", true, checkResult);        String noons = "noons";        checkResult = MyStringUtils.isPalindrome(noons);        Assert.assertEquals("not a pal", false, checkResult);    }    @Test    public void countOfVowels() throws Exception    {        String noon = "noon";        int trueCount = 2;        int voulCount =  MyStringUtils.countOfVowels(noon);        Assert.assertEquals("bad count", trueCount, voulCount);        String noons = "noauernvalefvnoon";        trueCount = 8;        voulCount =  MyStringUtils.countOfVowels(noons);        Assert.assertEquals("bad count", trueCount, voulCount);    }    @Test    public void oddContains() throws Exception    {        String main = "abcdefghi";        String sub = "acegi";        boolean isContained = MyStringUtils.oddContains(main, sub);        Assert.assertEquals("bad count", true, isContained);        main = "abcdefgh";        sub = "acegi";        isContained = MyStringUtils.oddContains(main, sub);        Assert.assertEquals("bad count", false, isContained);        main = "abcdefghiswedrftgyhujiko";        sub = "acegi";        isContained = MyStringUtils.oddContains(main, sub);        Assert.assertEquals("bad count", true, isContained);        main = "abcdefghiswedrftgyhujiko";        sub = "ab";        isContained = MyStringUtils.oddContains(main, sub);        Assert.assertEquals("bad count", false, isContained);    }}