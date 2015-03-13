package br.unicesumar.restserver.manterdisciplina;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/disciplinas")
@Transactional
public class ManterDisciplinaController {
    @Autowired
    private EntityManager em;
    
    @RequestMapping(method = RequestMethod.GET)
    public List<ManterDisciplina> Listar(){
        Query exemplo = em.createQuery("from ManterDisciplina"); 
        return exemplo.getResultList();
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public void Criar(@RequestBody ManterDisciplina disciplina){
        em.persist(disciplina);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public void Alterar(@RequestBody ManterDisciplina disciplina){
        ManterDisciplina novo = em.merge(disciplina);
        em.persist(novo);
    }
    
    @RequestMapping(method = RequestMethod.DELETE)
    public void Deletar(@PathVariable Long id){
        ManterDisciplina novo = em.find(ManterDisciplina.class, id);
        em.remove(novo);
    }
        
}
