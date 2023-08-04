package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import entities.Account;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import java.util.List;

import services.AccountService;
import views.DetailView.*;
import views.ListView.*;

public class AccountController extends Controller {

    public Result getAccount(int id){
        return ok(views.html.DetailView.accounts.render(AccountService.getInstance().getAccount(id).toString()));
    }

    public Result getAccounts(){
        List<Account> accounts = AccountService.getInstance().getAllAccounts();
        String output = new String();
        for (int i=0; i < accounts.size(); i++){
            output += accounts.get(i).toString() + "\n";
        }
        return ok(views.html.ListView.accounts.render(output));
    }
}
