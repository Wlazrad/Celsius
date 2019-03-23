package servlet;

import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;



public class ProfileService {
    private Map<Long, UserProfile> userProfiles = Database.getUsers();

    public ProfileService(){
        UserProfile userProfile1=
                new UserProfile(1L, "Jan", "Kowalski", "jan.kowalski@gmail.com");
        userProfiles.put(1L, userProfile1);
    }

    public List<UserProfile> getAllProfile(){
        List<UserProfile> list = new ArrayList<UserProfile>(userProfiles.values());
        return list;

    }

    public UserProfile getProfile(long profileId) {
        return userProfiles.get(profileId);
    }

    public UserProfile addProfile(UserProfile userProfile){
        userProfile.setProfileId(userProfiles.size()+1);
        userProfiles.put(userProfile.getProfileId(), userProfile);
        return userProfile;
    }

    public UserProfile updateProfile(UserProfile userProfile){
        if(userProfile.getProfileId()<=0) {
            return null;
        }else {
            userProfiles.put(userProfile.getProfileId(), userProfile);
            return userProfile;
        }

    }
    public  void removeProfile(long profileId){
        userProfiles.remove(profileId);
    }
}
