package projetos.goulart.goulartsession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Criado por Igor Goulart de Oliveira em 05/06/2018.
 */
public class Session {

    private static Session instance;
    private Map<String, Object> mapaValores;

    public static Session getInstance(){
        if(instance == null){
            instance = new Session();
        }
        return instance;
    }

    private Session(){
        this.mapaValores = new HashMap<>();
    }

    /**
     * Método responsável por adicionar um objeto na sessão
     * @param key
     * @param object
     */
    public void add(String key, Object object){
        mapaValores.put(key, object);
    }

    /**
     * Método responsável por remover um objeto da sessão
     * @param key
     */
    public void remove(String key){
        mapaValores.remove(key);
    }

    /**
     * Método responsável por coletar um objeto da sessão
     * @param key
     * @return
     */
    public Object getObject(String key){
        return mapaValores.get(key);
    }

    /**
     * Método responsável por coletar as chaves da sessão
     * @return
     */
    public List<String> getChaves(){
        return new ArrayList<>(mapaValores.keySet());
    }

    /**
     * Método responsável por coletar os objetos da sessão
     * @return
     */
    public List<Object> getObjects(){
        return new ArrayList<>(mapaValores.values());
    }

}
