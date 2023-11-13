package modelREST;

public class Persoana {
 private Varsta varsta;
 private Oras oras;

 public Persoana(Varsta varsta, Oras oras) {
     this.varsta = varsta;
     this.oras = oras;
 }

 public Varsta getVarsta() {
     return varsta;
 }

 public void setVarsta(Varsta varsta) {
     this.varsta = varsta;
 }

 public Oras getOras() {
     return oras;
 }

 public void setOras(Oras oras) {
     this.oras = oras;
 }

 @Override
 public String toString() {
     return "Persoana [varsta=" + varsta + ", oras=" + oras + "]";
 }
}

