//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cookie cookie = new Cookie(50,"Round");
        cookie.print();
        System.out.println();

        ChocolateCookie choco = new ChocolateCookie(60,"Square",70);
        choco.print();
        System.out.println();

        ChoclateCookieWithExtras extras = new ChoclateCookieWithExtras(80,"Triangle",70,"Hazelnuts");
        extras.print();
        System.out.println();


        }
    }
