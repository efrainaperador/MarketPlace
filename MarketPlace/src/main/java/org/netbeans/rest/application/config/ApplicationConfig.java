
package org.netbeans.rest.application.config;

import java.util.Set;
import javax.ws.rs.core.Application;
import model.servicio.*;

/**
 *
 * @author daniel
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<Class<?>>();
        addRestResourceClasses(resources);
        return resources;
    }
    
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(ComentarioServicio.class);resources.add(DepartamentoServicio.class);resources.add(ProductoServicio.class);resources.add(AdministradorServicio.class);resources.add(ClienteServicio.class);resources.add(CategoriaServicio.class);resources.add(Tipo_DocumentoServicio.class);resources.add(DireccionServicio.class);resources.add(CarroCompraServicio.class);resources.add(CiudadServicio.class);
    }
    
}

