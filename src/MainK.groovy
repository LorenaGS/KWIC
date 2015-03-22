/**
 * Created by Sango on 21/03/2015.
 */
class MainK {
    void main() {
        def lista = [];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
        def input = br.readLine();
        while(input!="::") {
            lista.add(input);
            input = br.readLine();
        }
        def lista2 =[];
        def lineaE = [];
        input = br.readLine();
        while(input!="") {
            lineaE = input.split(" ");
            lista2.add(lineaE);
            input = br.readLine();
        }
        println lista;
        println lista2;
    }


}
