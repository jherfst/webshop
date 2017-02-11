package sr.unasat.service.sr.unasat.webshop.core;

import sr.unasat.service.EtenService;
import sr.unasat.service.impl.EtenServiceImpl;

/**
 * Created by rpique on 1/25/2017.
 */
public class ServiceLocator {

    private static ServiceLocator instance = null;

    private ServiceLocator(){
        
    }
    
    public static ServiceLocator getInstance(){
        if(instance == null){
            instance = new ServiceLocator();
        }
        return instance;
    }

    public EtenService getEtenService(){
        return new EtenServiceImpl();
    }
}
