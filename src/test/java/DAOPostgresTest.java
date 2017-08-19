
import br.edu.ifpb.pod.concorrencia.atividade.Row;
import br.edu.ifpb.pod.concorrencia.atividade.RowDAO;
import br.edu.ifpb.pod.concorrencia.atividade.RowPostgres;
import com.sun.istack.internal.logging.Logger;
import java.sql.SQLException;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miolivc
 */
public class DAOPostgresTest {
    
    private RowDAO dao;
    
    @Before
    public void setUp() throws SQLException, ClassNotFoundException {
        this.dao = new RowPostgres();
    }
//    
//    @Test
//    public void testaTempoInsercao() {
//        //576ms - 173ms - 239ms
//        long initial = System.currentTimeMillis();
//        Row row = new Row(1, "Teste JUNIT", System.currentTimeMillis());
//        dao.add(row);
//        long finale = System.currentTimeMillis();
//        Logger.getLogger(RowPostgres.class).severe("Demorou " + (finale - initial) + "ms");
//    }
//    
//    @Test
//    public void testaTempo10InsercaoTwoThread() {
//        long initial = System.currentTimeMillis();
//        
//        // Inserindo 1000 dados / 2 threads: 430ms - 382ms;
//        
//        new Thread(() -> {
//            for(int i = 0; i < 5000; i++) {
//                dao.add(new Row(1, "Teste JUNIT thread1", System.currentTimeMillis()));
//            }
//        }).start();
//        
//        new Thread(() -> {
//            for(int i = 0; i < 5000; i++) {
//                dao.add(new Row(1, "Teste JUNIT thread1", System.currentTimeMillis()));
//            }
//        }).start();
//        
//        long finale = System.currentTimeMillis();
//        Logger.getLogger(RowPostgres.class).severe("Demorou " + (finale - initial) + "ms com 2 threads");
//    }
//    
//    
//    
}
