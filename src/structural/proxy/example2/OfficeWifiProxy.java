package structural.proxy.example2;

public class OfficeWifiProxy implements Internet {
    private String employeeId;

    // Declaring this object is necessary as this class is created to control access to it.
    private WifiConnection wifi;

    public OfficeWifiProxy(String employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public void connect() {
        System.out.println("-------------------------------");
        if(isValidEmployee()){
            if(wifi == null){
                this.wifi = new WifiConnection();
            }
            System.out.println("Employee Id: "+ this.employeeId);
            this.wifi.connect();
        }else{
            System.out.println("Invalid Employee Id: "+ this.employeeId+". Cannot connect to internet. ");
        }
        System.out.println("-------------------------------");
    }

    @Override
    public void disconnect() {

    }

    private boolean isValidEmployee(){
        // Some validation logic
        return this.employeeId != null && this.employeeId.length() > 0;
    }
}
