package oit.is.z0968.kaizi.janken.model;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

@Component
public class Entry {
  ArrayList<String> users = new ArrayList<>();
  int entryNo = 1;

  public void addUser(String name) {
    // 同名のユーザが居たら何もせずにreturn
    for (String a : this.users) {
      if (a.equals(name)) {
        return;
      }
    }
    // 同名のユーザが居なかった場合はusersにloginuserを追加する
    this.users.add(name);
  }

  // 以降はフィールドのgetter/setter
  // これらがないとThymeleafで値を取得できない
  public int getEntryNo() {
    return entryNo;
  }

  public void setEntryNo(int entryNo) {
    this.entryNo = entryNo;
  }

  public ArrayList<String> getUsers() {
    return users;
  }

  public void setUsers(ArrayList<String> users) {
    this.users = users;
  }

}
