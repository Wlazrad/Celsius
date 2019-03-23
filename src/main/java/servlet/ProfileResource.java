package servlet;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("/profile")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class ProfileResource {
    private ProfileService profileService = new ProfileService();

    @GET
    public List<UserProfile> getProfile(){
        return profileService.getAllProfile();
    }

    @GET
    @Path("/{profileId}")

    public UserProfile getProfile(@PathParam("profileId") long profileId){
        return profileService.getProfile(profileId);
    }

    @POST
    public UserProfile addProfile(UserProfile userProfile){
        return profileService.addProfile(userProfile);

    }

    @PUT
    @Path("/{profileId}")
    public UserProfile updateProfile(@PathParam("profileId") long profileId, UserProfile userProfile){
        userProfile.setProfileId(profileId);
        return profileService.updateProfile(userProfile);
    }

    @DELETE
    @Path("/{profileId}")
    public void deleteProfile(@PathParam("profileId") long profileId){
        profileService.removeProfile(profileId);
    }
}
