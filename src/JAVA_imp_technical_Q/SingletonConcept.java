package JAVA_imp_technical_Q;

class Helper{

    // ✅ यह line बहुत IMPORTANT है:
    // यहाँ object एक बार ही memory में बनता है
    // और पूरे program में यही SINGLE OBJECT use होता है
    public static final Helper INSTANCE = new Helper();

    // constructor private है, मतलब बाहर से new नहीं कर सकते
    private Helper(){}

    // इस method से object access किया जाता है
    public static Helper getInstance(){

        // हर बार यही SINGLE OBJECT return होगा
        return INSTANCE;
    }
    public void shoMessage(){
        System.out.println("hello DB");
    }
}

class A{

    public static void main(String[] args){

        // जब हम पहली बार getInstance() कॉल करते हैं
        Helper h1 = Helper.getInstance();

        // यहाँ obj1 को वही SINGLE OBJECT मिलेगा
        // जो class के अंदर पहले से बना हुआ है

        // दूसरी बार getInstance() कॉल करने पर भी
        Helper h2 = Helper.getInstance();
        // obj2 को नया object नहीं मिलेगा
        // बल्कि obj1 वाला ही SAME OBJECT मिलेगा
        h1.shoMessage(); // object से method call

        // obj1 और obj2 दोनों एक ही object को point करते हैं
        System.out.println(h1==h2);

    }


}
