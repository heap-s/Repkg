package org.repkg.packages;

import java.util.List;
import java.util.ArrayList;
public class Repkg {
    private List<PackageVer> packageVers;

    public Repkg() {
        this.packageVers = new ArrayList<>();
    }

    public Repkg(List<PackageVer> packageVers) {
        this.packageVers = packageVers;
    }

     public List<PackageVer> getPackageVers() {
        return packageVers;
     }

     public void setPackageVers(List<PackageVer> packageVers) {
        this.packageVers = packageVers;
     }
    
}
