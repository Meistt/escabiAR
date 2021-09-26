package ar.edu.unlam.tallerweb1.controladores;


import ar.edu.unlam.tallerweb1.servicios.ServicioBebida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ControladorBebida {

    private ServicioBebida servicioBebida;

    @Autowired
    public ControladorBebida(ServicioBebida servicioBebida){
        this.servicioBebida = servicioBebida;
    }



    @RequestMapping(path="mostrarBebidas" , method = RequestMethod.GET)
    public ModelAndView mostrarBebidas(){
        ModelMap model = new ModelMap();

        model.put("BEBIDAS", servicioBebida.listarBebidas());

        return new ModelAndView("listado-bebidas", model);
    }

    //Filtrar por nombre
    @RequestMapping(path = "buscar-bebida", method = RequestMethod.GET)
    public ModelAndView buscadorBebidas(@RequestParam("search") String search){
        ModelMap model = new ModelMap();
        model.put("BEBIDA_BUSCADA", search);

        try {
            if(servicioBebida.buscarBebida(search).isEmpty()){
                model.put("ERROR", "No se encontro bebida");
                return new ModelAndView("listado-bebidas",model);
            }

            model.put("BEBIDAS",servicioBebida.buscarBebida(search));
        }

        catch (Exception e){
            model.put("ERROR", "Ha ocurrido un error inesperado");
        }

        return  new ModelAndView("listado-bebidas",model);
    }
}
