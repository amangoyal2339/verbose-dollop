public class stringtointeger {
    public static void main(String[] args) {
        String name ="123";
        int k = Integer.parseInt(name);
        System.out.println(k);
        
        name ="10.5";
        double i=Double.parseDouble(name);
        System.out.println(i);

        String binartk = Integer.toBinaryString(k);
        System.out.println(binartk);

        System.out.println(Integer.parseInt(binartk,2));


    }
}