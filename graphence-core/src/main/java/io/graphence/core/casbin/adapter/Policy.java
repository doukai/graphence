package io.graphence.core.casbin.adapter;

import com.dslplatform.json.CompiledJson;
import org.eclipse.microprofile.graphql.Type;

import java.util.ArrayList;
import java.util.List;

@Type
@CompiledJson
public class Policy {
    private String id;
    private String ptype;
    private String v0;
    private String v1;
    private String v2;
    private String v3;
    private String v4;
    private String v5;

    public Policy() {
    }

    public Policy(String ptype, List<String> line) {
        this.ptype = ptype;
        this.id = ptype + "," + String.join(",", line);
        if (line.size() >= 1 && line.get(0) != null) {
            v0 = line.get(0);
        }
        if (line.size() >= 2 && line.get(1) != null) {
            v1 = line.get(1);
        }
        if (line.size() >= 3 && line.get(2) != null) {
            v2 = line.get(2);
        }
        if (line.size() >= 4 && line.get(3) != null) {
            v3 = line.get(3);
        }
        if (line.size() >= 5 && line.get(4) != null) {
            v4 = line.get(4);
        }
        if (line.size() >= 6 && line.get(5) != null) {
            v5 = line.get(5);
        }
    }

    public String getId() {
        return id;
    }

    public Policy setId(String id) {
        this.id = id;
        return this;
    }

    public String getPtype() {
        return ptype;
    }

    public Policy setPtype(String ptype) {
        this.ptype = ptype;
        return this;
    }

    public String getV0() {
        return v0;
    }

    public Policy setV0(String v0) {
        this.v0 = v0;
        return this;
    }

    public String getV1() {
        return v1;
    }

    public Policy setV1(String v1) {
        this.v1 = v1;
        return this;
    }

    public String getV2() {
        return v2;
    }

    public Policy setV2(String v2) {
        this.v2 = v2;
        return this;
    }

    public String getV3() {
        return v3;
    }

    public Policy setV3(String v3) {
        this.v3 = v3;
        return this;
    }

    public String getV4() {
        return v4;
    }

    public Policy setV4(String v4) {
        this.v4 = v4;
        return this;
    }

    public String getV5() {
        return v5;
    }

    public Policy setV5(String v5) {
        this.v5 = v5;
        return this;
    }

    @Override
    public String toString() {
        String lineText = getPtype();
        if (getV0() != null) {
            lineText += ", " + getV0();
        }
        if (getV1() != null) {
            lineText += ", " + getV1();
        }
        if (getV2() != null) {
            lineText += ", " + getV2();
        }
        if (getV3() != null) {
            lineText += ", " + getV3();
        }
        if (getV4() != null) {
            lineText += ", " + getV4();
        }
        if (getV5() != null) {
            lineText += ", " + getV5();
        }
        return lineText;
    }

    public List<String> toStringList() {
        List<String> stringList = new ArrayList<>();
        if (getV0() != null) {
            stringList.add(getV0());
        }
        if (getV1() != null) {
            stringList.add(getV1());
        }
        if (getV2() != null) {
            stringList.add(getV2());
        }
        if (getV3() != null) {
            stringList.add(getV3());
        }
        if (getV4() != null) {
            stringList.add(getV4());
        }
        if (getV5() != null) {
            stringList.add(getV5());
        }
        return stringList;
    }
}
