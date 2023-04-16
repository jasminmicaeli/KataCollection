public class WhoLikesIt {
    public String getLikes(String[] given) {

        return  given.length == 1 ? given[0] + " likes it" :
                given.length == 2 ? given[0] + " and " + given[1] + " like it" :
                given.length == 3 ? given[0] + ", " + given[1] + " and " + given[2] + " like it" :
                given.length >= 4 ? given[0] + ", " + given[1] + " and " + String.valueOf(given.length-2) + " others like it":
                "no one likes it";
    }
}