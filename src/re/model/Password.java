package re.model;

public class Password {
    public Password() {
        // String random = RandomStringUtils.randomAlphanumeric(10);
    }

    public static String randomString(int length) {
        System.out.println("Length:: "+length);
        char[] alpha = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] ALPHA = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] numeric = "0123456789".toCharArray();
        char[] special = "@#-%$)*".toCharArray();

        StringBuilder random = new StringBuilder();

        Float x = Float.valueOf(length / 4);
        int a = String.valueOf(x).contains(".")?x.intValue()+1:x.intValue();

        for (int i = 0; i < a; i++){
            int v = (int)(alpha.length* Math.random());
            random.append(alpha[v]);
        }

        for (int i = 0; i < a; i++){
            int v = (int) (ALPHA.length * Math.random());
            random.append(ALPHA[v]);
        }

        for (int i = 0; i < a; i++){
            int v = (int) (numeric.length * Math.random());
            random.append(numeric[v]);
        }

        for (int i = 0; i < a; i++){
            int v = (int) ( special.length * Math.random());
            random.append(special[v]);
        }

        System.out.println(random);
        return random.toString();
    }

}
