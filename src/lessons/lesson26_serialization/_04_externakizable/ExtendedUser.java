package lessons.lesson26_serialization._04_externakizable;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExtendedUser implements Externalizable {

    private String name;
    private String login;
    private String password;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(login);
        out.writeObject(encrypt(password));
    }

    private String encrypt(String data) {
        String encode = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encode);
        return encode;
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name = (String) in.readObject();
        login = (String) in.readObject();
        password = decrypt((String) in.readObject());

    }

    private String decrypt(String data) {
        String decode = new String(Base64.getDecoder().decode(data));
        System.out.println(decode);
        return decode;
    }


}
