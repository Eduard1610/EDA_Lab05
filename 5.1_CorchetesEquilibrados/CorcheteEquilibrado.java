/**
     * Given a string of brackets,
     * it determines whether each sequence of brackets is balanced.
     * If a string is balanced, return YES. Otherwise, return NO.
     *
     * Examples
     *  case 1: '{[()]}'     returns YES
     *  case 2: '[(])'       returns NO
     *  case 3: '[[(())]]'  returns YES
     *
     * @param a the string of brackets
     * @return YES if the brackets are balanced
     *         NO if the brackets are not balanced
*/
public class CorcheteEquilibrado{
  public static void main(String [] args){
    //String str = "()[({)]}()";
    //String str = "([]{})[()]()";
    //String str = "{[()]}";      //returns YES
    //String str = "[(])";      //returns NO
    //String str = "[[(())]]";  //returns YES
    String str = "([]{})[({)]()}[]";
    System.out.println("Cadena : " + str);
    System.out.println(isBalanced(str));
  }
  public static String isBalanced(String s){
    String rpta = "NO";//rpta almacena el string que devolvera la funcion : "SI" o "NO"
    if(s.length() % 2 != 0)//verifica si la cadena tiene una longitud par
      return rpta;
    int i = s.length()/2;//Variable auxiliar para el bucle, almacena la mitad de la longitud de la cadena
    while(i>0){
        i--;//Por cada iteracion se reduce su valor
        int aux = s.indexOf("()");//busca la posicion de la cadena "()"
        if(aux==-1) aux = s.indexOf("[]");//Si no encuentra posicion (aux = -1) busca la siguiente cadena "[]"
        if(aux==-1) aux = s.indexOf("{}");//Si no encuentra posicion (aux = -1) busca la siguiente cadena "{}"
        if(aux!=-1)//En caso de que una de las 3 cadena se halla encontrado
            s = s.substring(0, aux) + s.substring(aux + 2);//eliminina ese pedazo de cadena de la cadena principal s
    }
    if(s.length()==0)//Si se han logrado eliminar todos los pares de [], {}, () entonces la cadena s es balanceada
        rpta = "SI";
    return rpta;
  }
}
