package br.edu.uniritter.criptografia;

/**
 *
 * @author alu201011612
 */
class CifraCesar {

    public static String cifrar(String texto, int deslocamento) {
        StringBuilder textoCifrado = new StringBuilder();
        
        for(char letra : texto.toCharArray()) {
            char letraCifrada = letra;
            
            if (Character.isLetter(letra)) {
                letraCifrada = (char) (((int) letra) + deslocamento);
            }
            
            textoCifrado.append(letraCifrada);
        }
        
        return textoCifrado.toString();
    }

}
