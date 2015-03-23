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
        def listaI = []
        for (i in 0..lista2.size()-1){
            lista2[i] = minusculas(lista2[i]);
        }
        lista2.each{x -> x.each{y->listaI.add(y)}};
        lista = minusculas(lista);
        listaI = minusculas(listaI);
        def a = lista.size()-1;
        def b = listaI.size()-1;
        for (i in 0..a) {
            for (j in 0..b) {
                if (lista[i] == listaI[j]) {
                    listaI.remove(j);
                }
            }
        }
        listaI = listaI.sort().unique();
        for (i in 0..listaI.size()-1) {
            for (j in 0..lista2.size() - 1) {
                for (k in 0..lista2[j].size() - 1) {
                    if (listaI[i] == lista2[j][k]) {
                        def temp = [];
                        lista2[j].each { y -> temp.add(y) };
                        temp[k] = temp[k].toUpperCase();
                        imprimeTitulo(temp);
                    }
                }
            }
        }
    }
    def imprimeTitulo(lista){
        for (i in 0..lista.size()-1){
            print lista[i] + " " ;
        }
        println " ";
    }

    def minusculas(lista){
        for (i in 0..lista.size()-1){
            lista[i] = lista[i].toLowerCase();
        }
        return lista;
    }
}
