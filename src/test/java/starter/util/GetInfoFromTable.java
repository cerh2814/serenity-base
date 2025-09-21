package starter.util;

import io.cucumber.datatable.DataTable;
import starter.models.LoginModels;
import starter.models.TransaccionModels;

import java.util.List;

public class GetInfoFromTable {

    public static LoginModels getLoginInfoCredentials(DataTable userLogin) {
        List<List<String>> rows = userLogin.asLists(String.class);
        String username="";
        String password="";

        for (List<String> columns : rows) {
            username = columns.get(0);
            password = columns.get(1);
        }

        LoginModels loginModels = new LoginModels();
        loginModels.setUsername(username);
        loginModels.setPassword(password);
        return loginModels;
    }

    public static TransaccionModels getTransaccionDataCredencials(DataTable transaccionInfo) {
        List<List<String>> rows = transaccionInfo.asLists(String.class);
        String transaccionDate="";
        String transaccionAmount="";
        String transaccionDescription="";

        for (List<String> columns : rows) {
            transaccionDate = columns.get(0);
            transaccionAmount = columns.get(1);
            transaccionDescription= columns.get(2);
        }

        TransaccionModels transaccionModels = new TransaccionModels();
        transaccionModels.setTransaccionAmount(transaccionAmount);
        transaccionModels.setTransaccionDate(transaccionDate);
        transaccionModels.setTransaccionDescription(transaccionDescription);
        return transaccionModels;



    }
}
