
/*
 * Autor do código:
 *      Ronaldo Mendonça Zica
 *      E-mail: rzica42@gmail.com
 *      Github: ronaldozica
 */

public class NaoExisteVolumeException extends Exception{
    
    //@Override
    public String getMensagem()
    {
        return "Essa figura não possui volume.";
    }
}
