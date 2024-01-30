package ridzdoe;

public class Camera {
    private String mainCamera;
    private String frontCamera;
    private String ultrawideCamera;
    private String microCamera;
    private String telephotoLence;

    public Camera(String mainCamera, String frontCamera, String ultrawideCamera, String microCamera, String telephotoLence){
        this.mainCamera = mainCamera;
        this.frontCamera = frontCamera;
        this.ultrawideCamera =ultrawideCamera;
        this.microCamera = microCamera;
        this.telephotoLence = telephotoLence;
    }

    public String getMainCamera(){
        return mainCamera;
    } 

    public String getFrontCamera(){
        return frontCamera;
    }

    public String getUltrawideCamera(){
        return ultrawideCamera;
    }

    public String getMicroCamera(){
        return microCamera;
    }

    public String getTelephotoLence(){
        return telephotoLence;
    }
}
