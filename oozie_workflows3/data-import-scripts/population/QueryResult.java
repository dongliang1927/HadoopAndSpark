// ORM class for table 'null'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jul 04 08:59:21 GMT 2018
// For connector: org.apache.sqoop.manager.OracleManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class QueryResult extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("REGION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        REGION = (String)value;
      }
    });
    setters.put("ID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ORGID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORGID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ORGNAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORGNAME = (String)value;
      }
    });
    setters.put("GRIDID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GRIDID = (java.math.BigDecimal)value;
      }
    });
    setters.put("GRIDNAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GRIDNAME = (String)value;
      }
    });
    setters.put("BUILDINGGROUPID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BUILDINGGROUPID = (java.math.BigDecimal)value;
      }
    });
    setters.put("BUILDINGNAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BUILDINGNAME = (String)value;
      }
    });
    setters.put("CODENUMBER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CODENUMBER = (String)value;
      }
    });
    setters.put("NAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NAME = (String)value;
      }
    });
    setters.put("BASEBUILDINGTYPEID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BASEBUILDINGTYPEID = (java.math.BigDecimal)value;
      }
    });
    setters.put("BASEBUILDINGTYPENAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BASEBUILDINGTYPENAME = (String)value;
      }
    });
    setters.put("BASEBUILDTYPEID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BASEBUILDTYPEID = (java.math.BigDecimal)value;
      }
    });
    setters.put("BASEBUILDTYPENAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BASEBUILDTYPENAME = (String)value;
      }
    });
    setters.put("BASESTRUCTUREID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BASESTRUCTUREID = (java.math.BigDecimal)value;
      }
    });
    setters.put("BASESTRUCTURENAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BASESTRUCTURENAME = (String)value;
      }
    });
    setters.put("NATUREID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NATUREID = (java.math.BigDecimal)value;
      }
    });
    setters.put("NATURENAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        NATURENAME = (String)value;
      }
    });
    setters.put("HEIGHT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        HEIGHT = (java.math.BigDecimal)value;
      }
    });
    setters.put("ADDRESS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ADDRESS = (String)value;
      }
    });
    setters.put("USE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        USE = (String)value;
      }
    });
    setters.put("BUILTYEAR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BUILTYEAR = (java.math.BigDecimal)value;
      }
    });
    setters.put("STOREYABOVE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STOREYABOVE = (java.math.BigDecimal)value;
      }
    });
    setters.put("STOREYUNDER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        STOREYUNDER = (java.math.BigDecimal)value;
      }
    });
    setters.put("ROOMNUMBYUNITFLOOR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ROOMNUMBYUNITFLOOR = (java.math.BigDecimal)value;
      }
    });
    setters.put("ROOMS", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ROOMS = (java.math.BigDecimal)value;
      }
    });
    setters.put("UNITNUM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UNITNUM = (java.math.BigDecimal)value;
      }
    });
    setters.put("ISTOILET", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISTOILET = (String)value;
      }
    });
    setters.put("ISWATERMETER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISWATERMETER = (String)value;
      }
    });
    setters.put("ISELECTRICMETER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISELECTRICMETER = (String)value;
      }
    });
    setters.put("ISIMPORTANTPLACE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISIMPORTANTPLACE = (String)value;
      }
    });
    setters.put("AREA", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        AREA = (java.math.BigDecimal)value;
      }
    });
    setters.put("COORDINATEID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COORDINATEID = (java.math.BigDecimal)value;
      }
    });
    setters.put("PHOTO", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        PHOTO = (String)value;
      }
    });
    setters.put("REMARK", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        REMARK = (String)value;
      }
    });
    setters.put("ATTRIBUTESTR", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ATTRIBUTESTR = (String)value;
      }
    });
    setters.put("CREATEUSER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CREATEUSER = (String)value;
      }
    });
    setters.put("CREATETIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        CREATETIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("UPDATEUSER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UPDATEUSER = (String)value;
      }
    });
    setters.put("UPDATETIME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        UPDATETIME = (java.sql.Timestamp)value;
      }
    });
    setters.put("VERSION", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        VERSION = (java.math.BigDecimal)value;
      }
    });
    setters.put("DF1", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF1 = (String)value;
      }
    });
    setters.put("DF2", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF2 = (String)value;
      }
    });
    setters.put("DF3", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF3 = (String)value;
      }
    });
    setters.put("DF4", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF4 = (String)value;
      }
    });
    setters.put("DF5", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF5 = (String)value;
      }
    });
    setters.put("DF6", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF6 = (String)value;
      }
    });
    setters.put("DF7", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF7 = (String)value;
      }
    });
    setters.put("DF8", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF8 = (String)value;
      }
    });
    setters.put("DF9", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF9 = (String)value;
      }
    });
    setters.put("DF10", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        DF10 = (String)value;
      }
    });
    setters.put("BUILDINGADMIN", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BUILDINGADMIN = (String)value;
      }
    });
    setters.put("BUILDINGCONTACT", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BUILDINGCONTACT = (String)value;
      }
    });
    setters.put("BUILDINGPOLICE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BUILDINGPOLICE = (String)value;
      }
    });
    setters.put("BUILDINGPOLICETEL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        BUILDINGPOLICETEL = (String)value;
      }
    });
    setters.put("COMMANAGER", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMMANAGER = (String)value;
      }
    });
    setters.put("COMMTEL", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        COMMTEL = (String)value;
      }
    });
    setters.put("ORGPATH", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ORGPATH = (String)value;
      }
    });
    setters.put("GEOM", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GEOM = (String)value;
      }
    });
    setters.put("GID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        GID = (String)value;
      }
    });
    setters.put("ISLOCATE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISLOCATE = (String)value;
      }
    });
    setters.put("MAPSAMLLTYPEID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAPSAMLLTYPEID = (java.math.BigDecimal)value;
      }
    });
    setters.put("MAPSAMLLTYPENAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAPSAMLLTYPENAME = (String)value;
      }
    });
    setters.put("MAPBIGTYPENAME", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAPBIGTYPENAME = (String)value;
      }
    });
    setters.put("MAPBIGTYPEID", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        MAPBIGTYPEID = (java.math.BigDecimal)value;
      }
    });
    setters.put("ISBUSINE", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        ISBUSINE = (String)value;
      }
    });
  }
  public QueryResult() {
    init0();
  }
  private String REGION;
  public String get_REGION() {
    return REGION;
  }
  public void set_REGION(String REGION) {
    this.REGION = REGION;
  }
  public QueryResult with_REGION(String REGION) {
    this.REGION = REGION;
    return this;
  }
  private java.math.BigDecimal ID;
  public java.math.BigDecimal get_ID() {
    return ID;
  }
  public void set_ID(java.math.BigDecimal ID) {
    this.ID = ID;
  }
  public QueryResult with_ID(java.math.BigDecimal ID) {
    this.ID = ID;
    return this;
  }
  private java.math.BigDecimal ORGID;
  public java.math.BigDecimal get_ORGID() {
    return ORGID;
  }
  public void set_ORGID(java.math.BigDecimal ORGID) {
    this.ORGID = ORGID;
  }
  public QueryResult with_ORGID(java.math.BigDecimal ORGID) {
    this.ORGID = ORGID;
    return this;
  }
  private String ORGNAME;
  public String get_ORGNAME() {
    return ORGNAME;
  }
  public void set_ORGNAME(String ORGNAME) {
    this.ORGNAME = ORGNAME;
  }
  public QueryResult with_ORGNAME(String ORGNAME) {
    this.ORGNAME = ORGNAME;
    return this;
  }
  private java.math.BigDecimal GRIDID;
  public java.math.BigDecimal get_GRIDID() {
    return GRIDID;
  }
  public void set_GRIDID(java.math.BigDecimal GRIDID) {
    this.GRIDID = GRIDID;
  }
  public QueryResult with_GRIDID(java.math.BigDecimal GRIDID) {
    this.GRIDID = GRIDID;
    return this;
  }
  private String GRIDNAME;
  public String get_GRIDNAME() {
    return GRIDNAME;
  }
  public void set_GRIDNAME(String GRIDNAME) {
    this.GRIDNAME = GRIDNAME;
  }
  public QueryResult with_GRIDNAME(String GRIDNAME) {
    this.GRIDNAME = GRIDNAME;
    return this;
  }
  private java.math.BigDecimal BUILDINGGROUPID;
  public java.math.BigDecimal get_BUILDINGGROUPID() {
    return BUILDINGGROUPID;
  }
  public void set_BUILDINGGROUPID(java.math.BigDecimal BUILDINGGROUPID) {
    this.BUILDINGGROUPID = BUILDINGGROUPID;
  }
  public QueryResult with_BUILDINGGROUPID(java.math.BigDecimal BUILDINGGROUPID) {
    this.BUILDINGGROUPID = BUILDINGGROUPID;
    return this;
  }
  private String BUILDINGNAME;
  public String get_BUILDINGNAME() {
    return BUILDINGNAME;
  }
  public void set_BUILDINGNAME(String BUILDINGNAME) {
    this.BUILDINGNAME = BUILDINGNAME;
  }
  public QueryResult with_BUILDINGNAME(String BUILDINGNAME) {
    this.BUILDINGNAME = BUILDINGNAME;
    return this;
  }
  private String CODENUMBER;
  public String get_CODENUMBER() {
    return CODENUMBER;
  }
  public void set_CODENUMBER(String CODENUMBER) {
    this.CODENUMBER = CODENUMBER;
  }
  public QueryResult with_CODENUMBER(String CODENUMBER) {
    this.CODENUMBER = CODENUMBER;
    return this;
  }
  private String NAME;
  public String get_NAME() {
    return NAME;
  }
  public void set_NAME(String NAME) {
    this.NAME = NAME;
  }
  public QueryResult with_NAME(String NAME) {
    this.NAME = NAME;
    return this;
  }
  private java.math.BigDecimal BASEBUILDINGTYPEID;
  public java.math.BigDecimal get_BASEBUILDINGTYPEID() {
    return BASEBUILDINGTYPEID;
  }
  public void set_BASEBUILDINGTYPEID(java.math.BigDecimal BASEBUILDINGTYPEID) {
    this.BASEBUILDINGTYPEID = BASEBUILDINGTYPEID;
  }
  public QueryResult with_BASEBUILDINGTYPEID(java.math.BigDecimal BASEBUILDINGTYPEID) {
    this.BASEBUILDINGTYPEID = BASEBUILDINGTYPEID;
    return this;
  }
  private String BASEBUILDINGTYPENAME;
  public String get_BASEBUILDINGTYPENAME() {
    return BASEBUILDINGTYPENAME;
  }
  public void set_BASEBUILDINGTYPENAME(String BASEBUILDINGTYPENAME) {
    this.BASEBUILDINGTYPENAME = BASEBUILDINGTYPENAME;
  }
  public QueryResult with_BASEBUILDINGTYPENAME(String BASEBUILDINGTYPENAME) {
    this.BASEBUILDINGTYPENAME = BASEBUILDINGTYPENAME;
    return this;
  }
  private java.math.BigDecimal BASEBUILDTYPEID;
  public java.math.BigDecimal get_BASEBUILDTYPEID() {
    return BASEBUILDTYPEID;
  }
  public void set_BASEBUILDTYPEID(java.math.BigDecimal BASEBUILDTYPEID) {
    this.BASEBUILDTYPEID = BASEBUILDTYPEID;
  }
  public QueryResult with_BASEBUILDTYPEID(java.math.BigDecimal BASEBUILDTYPEID) {
    this.BASEBUILDTYPEID = BASEBUILDTYPEID;
    return this;
  }
  private String BASEBUILDTYPENAME;
  public String get_BASEBUILDTYPENAME() {
    return BASEBUILDTYPENAME;
  }
  public void set_BASEBUILDTYPENAME(String BASEBUILDTYPENAME) {
    this.BASEBUILDTYPENAME = BASEBUILDTYPENAME;
  }
  public QueryResult with_BASEBUILDTYPENAME(String BASEBUILDTYPENAME) {
    this.BASEBUILDTYPENAME = BASEBUILDTYPENAME;
    return this;
  }
  private java.math.BigDecimal BASESTRUCTUREID;
  public java.math.BigDecimal get_BASESTRUCTUREID() {
    return BASESTRUCTUREID;
  }
  public void set_BASESTRUCTUREID(java.math.BigDecimal BASESTRUCTUREID) {
    this.BASESTRUCTUREID = BASESTRUCTUREID;
  }
  public QueryResult with_BASESTRUCTUREID(java.math.BigDecimal BASESTRUCTUREID) {
    this.BASESTRUCTUREID = BASESTRUCTUREID;
    return this;
  }
  private String BASESTRUCTURENAME;
  public String get_BASESTRUCTURENAME() {
    return BASESTRUCTURENAME;
  }
  public void set_BASESTRUCTURENAME(String BASESTRUCTURENAME) {
    this.BASESTRUCTURENAME = BASESTRUCTURENAME;
  }
  public QueryResult with_BASESTRUCTURENAME(String BASESTRUCTURENAME) {
    this.BASESTRUCTURENAME = BASESTRUCTURENAME;
    return this;
  }
  private java.math.BigDecimal NATUREID;
  public java.math.BigDecimal get_NATUREID() {
    return NATUREID;
  }
  public void set_NATUREID(java.math.BigDecimal NATUREID) {
    this.NATUREID = NATUREID;
  }
  public QueryResult with_NATUREID(java.math.BigDecimal NATUREID) {
    this.NATUREID = NATUREID;
    return this;
  }
  private String NATURENAME;
  public String get_NATURENAME() {
    return NATURENAME;
  }
  public void set_NATURENAME(String NATURENAME) {
    this.NATURENAME = NATURENAME;
  }
  public QueryResult with_NATURENAME(String NATURENAME) {
    this.NATURENAME = NATURENAME;
    return this;
  }
  private java.math.BigDecimal HEIGHT;
  public java.math.BigDecimal get_HEIGHT() {
    return HEIGHT;
  }
  public void set_HEIGHT(java.math.BigDecimal HEIGHT) {
    this.HEIGHT = HEIGHT;
  }
  public QueryResult with_HEIGHT(java.math.BigDecimal HEIGHT) {
    this.HEIGHT = HEIGHT;
    return this;
  }
  private String ADDRESS;
  public String get_ADDRESS() {
    return ADDRESS;
  }
  public void set_ADDRESS(String ADDRESS) {
    this.ADDRESS = ADDRESS;
  }
  public QueryResult with_ADDRESS(String ADDRESS) {
    this.ADDRESS = ADDRESS;
    return this;
  }
  private String USE;
  public String get_USE() {
    return USE;
  }
  public void set_USE(String USE) {
    this.USE = USE;
  }
  public QueryResult with_USE(String USE) {
    this.USE = USE;
    return this;
  }
  private java.math.BigDecimal BUILTYEAR;
  public java.math.BigDecimal get_BUILTYEAR() {
    return BUILTYEAR;
  }
  public void set_BUILTYEAR(java.math.BigDecimal BUILTYEAR) {
    this.BUILTYEAR = BUILTYEAR;
  }
  public QueryResult with_BUILTYEAR(java.math.BigDecimal BUILTYEAR) {
    this.BUILTYEAR = BUILTYEAR;
    return this;
  }
  private java.math.BigDecimal STOREYABOVE;
  public java.math.BigDecimal get_STOREYABOVE() {
    return STOREYABOVE;
  }
  public void set_STOREYABOVE(java.math.BigDecimal STOREYABOVE) {
    this.STOREYABOVE = STOREYABOVE;
  }
  public QueryResult with_STOREYABOVE(java.math.BigDecimal STOREYABOVE) {
    this.STOREYABOVE = STOREYABOVE;
    return this;
  }
  private java.math.BigDecimal STOREYUNDER;
  public java.math.BigDecimal get_STOREYUNDER() {
    return STOREYUNDER;
  }
  public void set_STOREYUNDER(java.math.BigDecimal STOREYUNDER) {
    this.STOREYUNDER = STOREYUNDER;
  }
  public QueryResult with_STOREYUNDER(java.math.BigDecimal STOREYUNDER) {
    this.STOREYUNDER = STOREYUNDER;
    return this;
  }
  private java.math.BigDecimal ROOMNUMBYUNITFLOOR;
  public java.math.BigDecimal get_ROOMNUMBYUNITFLOOR() {
    return ROOMNUMBYUNITFLOOR;
  }
  public void set_ROOMNUMBYUNITFLOOR(java.math.BigDecimal ROOMNUMBYUNITFLOOR) {
    this.ROOMNUMBYUNITFLOOR = ROOMNUMBYUNITFLOOR;
  }
  public QueryResult with_ROOMNUMBYUNITFLOOR(java.math.BigDecimal ROOMNUMBYUNITFLOOR) {
    this.ROOMNUMBYUNITFLOOR = ROOMNUMBYUNITFLOOR;
    return this;
  }
  private java.math.BigDecimal ROOMS;
  public java.math.BigDecimal get_ROOMS() {
    return ROOMS;
  }
  public void set_ROOMS(java.math.BigDecimal ROOMS) {
    this.ROOMS = ROOMS;
  }
  public QueryResult with_ROOMS(java.math.BigDecimal ROOMS) {
    this.ROOMS = ROOMS;
    return this;
  }
  private java.math.BigDecimal UNITNUM;
  public java.math.BigDecimal get_UNITNUM() {
    return UNITNUM;
  }
  public void set_UNITNUM(java.math.BigDecimal UNITNUM) {
    this.UNITNUM = UNITNUM;
  }
  public QueryResult with_UNITNUM(java.math.BigDecimal UNITNUM) {
    this.UNITNUM = UNITNUM;
    return this;
  }
  private String ISTOILET;
  public String get_ISTOILET() {
    return ISTOILET;
  }
  public void set_ISTOILET(String ISTOILET) {
    this.ISTOILET = ISTOILET;
  }
  public QueryResult with_ISTOILET(String ISTOILET) {
    this.ISTOILET = ISTOILET;
    return this;
  }
  private String ISWATERMETER;
  public String get_ISWATERMETER() {
    return ISWATERMETER;
  }
  public void set_ISWATERMETER(String ISWATERMETER) {
    this.ISWATERMETER = ISWATERMETER;
  }
  public QueryResult with_ISWATERMETER(String ISWATERMETER) {
    this.ISWATERMETER = ISWATERMETER;
    return this;
  }
  private String ISELECTRICMETER;
  public String get_ISELECTRICMETER() {
    return ISELECTRICMETER;
  }
  public void set_ISELECTRICMETER(String ISELECTRICMETER) {
    this.ISELECTRICMETER = ISELECTRICMETER;
  }
  public QueryResult with_ISELECTRICMETER(String ISELECTRICMETER) {
    this.ISELECTRICMETER = ISELECTRICMETER;
    return this;
  }
  private String ISIMPORTANTPLACE;
  public String get_ISIMPORTANTPLACE() {
    return ISIMPORTANTPLACE;
  }
  public void set_ISIMPORTANTPLACE(String ISIMPORTANTPLACE) {
    this.ISIMPORTANTPLACE = ISIMPORTANTPLACE;
  }
  public QueryResult with_ISIMPORTANTPLACE(String ISIMPORTANTPLACE) {
    this.ISIMPORTANTPLACE = ISIMPORTANTPLACE;
    return this;
  }
  private java.math.BigDecimal AREA;
  public java.math.BigDecimal get_AREA() {
    return AREA;
  }
  public void set_AREA(java.math.BigDecimal AREA) {
    this.AREA = AREA;
  }
  public QueryResult with_AREA(java.math.BigDecimal AREA) {
    this.AREA = AREA;
    return this;
  }
  private java.math.BigDecimal COORDINATEID;
  public java.math.BigDecimal get_COORDINATEID() {
    return COORDINATEID;
  }
  public void set_COORDINATEID(java.math.BigDecimal COORDINATEID) {
    this.COORDINATEID = COORDINATEID;
  }
  public QueryResult with_COORDINATEID(java.math.BigDecimal COORDINATEID) {
    this.COORDINATEID = COORDINATEID;
    return this;
  }
  private String PHOTO;
  public String get_PHOTO() {
    return PHOTO;
  }
  public void set_PHOTO(String PHOTO) {
    this.PHOTO = PHOTO;
  }
  public QueryResult with_PHOTO(String PHOTO) {
    this.PHOTO = PHOTO;
    return this;
  }
  private String REMARK;
  public String get_REMARK() {
    return REMARK;
  }
  public void set_REMARK(String REMARK) {
    this.REMARK = REMARK;
  }
  public QueryResult with_REMARK(String REMARK) {
    this.REMARK = REMARK;
    return this;
  }
  private String ATTRIBUTESTR;
  public String get_ATTRIBUTESTR() {
    return ATTRIBUTESTR;
  }
  public void set_ATTRIBUTESTR(String ATTRIBUTESTR) {
    this.ATTRIBUTESTR = ATTRIBUTESTR;
  }
  public QueryResult with_ATTRIBUTESTR(String ATTRIBUTESTR) {
    this.ATTRIBUTESTR = ATTRIBUTESTR;
    return this;
  }
  private String CREATEUSER;
  public String get_CREATEUSER() {
    return CREATEUSER;
  }
  public void set_CREATEUSER(String CREATEUSER) {
    this.CREATEUSER = CREATEUSER;
  }
  public QueryResult with_CREATEUSER(String CREATEUSER) {
    this.CREATEUSER = CREATEUSER;
    return this;
  }
  private java.sql.Timestamp CREATETIME;
  public java.sql.Timestamp get_CREATETIME() {
    return CREATETIME;
  }
  public void set_CREATETIME(java.sql.Timestamp CREATETIME) {
    this.CREATETIME = CREATETIME;
  }
  public QueryResult with_CREATETIME(java.sql.Timestamp CREATETIME) {
    this.CREATETIME = CREATETIME;
    return this;
  }
  private String UPDATEUSER;
  public String get_UPDATEUSER() {
    return UPDATEUSER;
  }
  public void set_UPDATEUSER(String UPDATEUSER) {
    this.UPDATEUSER = UPDATEUSER;
  }
  public QueryResult with_UPDATEUSER(String UPDATEUSER) {
    this.UPDATEUSER = UPDATEUSER;
    return this;
  }
  private java.sql.Timestamp UPDATETIME;
  public java.sql.Timestamp get_UPDATETIME() {
    return UPDATETIME;
  }
  public void set_UPDATETIME(java.sql.Timestamp UPDATETIME) {
    this.UPDATETIME = UPDATETIME;
  }
  public QueryResult with_UPDATETIME(java.sql.Timestamp UPDATETIME) {
    this.UPDATETIME = UPDATETIME;
    return this;
  }
  private java.math.BigDecimal VERSION;
  public java.math.BigDecimal get_VERSION() {
    return VERSION;
  }
  public void set_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
  }
  public QueryResult with_VERSION(java.math.BigDecimal VERSION) {
    this.VERSION = VERSION;
    return this;
  }
  private String DF1;
  public String get_DF1() {
    return DF1;
  }
  public void set_DF1(String DF1) {
    this.DF1 = DF1;
  }
  public QueryResult with_DF1(String DF1) {
    this.DF1 = DF1;
    return this;
  }
  private String DF2;
  public String get_DF2() {
    return DF2;
  }
  public void set_DF2(String DF2) {
    this.DF2 = DF2;
  }
  public QueryResult with_DF2(String DF2) {
    this.DF2 = DF2;
    return this;
  }
  private String DF3;
  public String get_DF3() {
    return DF3;
  }
  public void set_DF3(String DF3) {
    this.DF3 = DF3;
  }
  public QueryResult with_DF3(String DF3) {
    this.DF3 = DF3;
    return this;
  }
  private String DF4;
  public String get_DF4() {
    return DF4;
  }
  public void set_DF4(String DF4) {
    this.DF4 = DF4;
  }
  public QueryResult with_DF4(String DF4) {
    this.DF4 = DF4;
    return this;
  }
  private String DF5;
  public String get_DF5() {
    return DF5;
  }
  public void set_DF5(String DF5) {
    this.DF5 = DF5;
  }
  public QueryResult with_DF5(String DF5) {
    this.DF5 = DF5;
    return this;
  }
  private String DF6;
  public String get_DF6() {
    return DF6;
  }
  public void set_DF6(String DF6) {
    this.DF6 = DF6;
  }
  public QueryResult with_DF6(String DF6) {
    this.DF6 = DF6;
    return this;
  }
  private String DF7;
  public String get_DF7() {
    return DF7;
  }
  public void set_DF7(String DF7) {
    this.DF7 = DF7;
  }
  public QueryResult with_DF7(String DF7) {
    this.DF7 = DF7;
    return this;
  }
  private String DF8;
  public String get_DF8() {
    return DF8;
  }
  public void set_DF8(String DF8) {
    this.DF8 = DF8;
  }
  public QueryResult with_DF8(String DF8) {
    this.DF8 = DF8;
    return this;
  }
  private String DF9;
  public String get_DF9() {
    return DF9;
  }
  public void set_DF9(String DF9) {
    this.DF9 = DF9;
  }
  public QueryResult with_DF9(String DF9) {
    this.DF9 = DF9;
    return this;
  }
  private String DF10;
  public String get_DF10() {
    return DF10;
  }
  public void set_DF10(String DF10) {
    this.DF10 = DF10;
  }
  public QueryResult with_DF10(String DF10) {
    this.DF10 = DF10;
    return this;
  }
  private String BUILDINGADMIN;
  public String get_BUILDINGADMIN() {
    return BUILDINGADMIN;
  }
  public void set_BUILDINGADMIN(String BUILDINGADMIN) {
    this.BUILDINGADMIN = BUILDINGADMIN;
  }
  public QueryResult with_BUILDINGADMIN(String BUILDINGADMIN) {
    this.BUILDINGADMIN = BUILDINGADMIN;
    return this;
  }
  private String BUILDINGCONTACT;
  public String get_BUILDINGCONTACT() {
    return BUILDINGCONTACT;
  }
  public void set_BUILDINGCONTACT(String BUILDINGCONTACT) {
    this.BUILDINGCONTACT = BUILDINGCONTACT;
  }
  public QueryResult with_BUILDINGCONTACT(String BUILDINGCONTACT) {
    this.BUILDINGCONTACT = BUILDINGCONTACT;
    return this;
  }
  private String BUILDINGPOLICE;
  public String get_BUILDINGPOLICE() {
    return BUILDINGPOLICE;
  }
  public void set_BUILDINGPOLICE(String BUILDINGPOLICE) {
    this.BUILDINGPOLICE = BUILDINGPOLICE;
  }
  public QueryResult with_BUILDINGPOLICE(String BUILDINGPOLICE) {
    this.BUILDINGPOLICE = BUILDINGPOLICE;
    return this;
  }
  private String BUILDINGPOLICETEL;
  public String get_BUILDINGPOLICETEL() {
    return BUILDINGPOLICETEL;
  }
  public void set_BUILDINGPOLICETEL(String BUILDINGPOLICETEL) {
    this.BUILDINGPOLICETEL = BUILDINGPOLICETEL;
  }
  public QueryResult with_BUILDINGPOLICETEL(String BUILDINGPOLICETEL) {
    this.BUILDINGPOLICETEL = BUILDINGPOLICETEL;
    return this;
  }
  private String COMMANAGER;
  public String get_COMMANAGER() {
    return COMMANAGER;
  }
  public void set_COMMANAGER(String COMMANAGER) {
    this.COMMANAGER = COMMANAGER;
  }
  public QueryResult with_COMMANAGER(String COMMANAGER) {
    this.COMMANAGER = COMMANAGER;
    return this;
  }
  private String COMMTEL;
  public String get_COMMTEL() {
    return COMMTEL;
  }
  public void set_COMMTEL(String COMMTEL) {
    this.COMMTEL = COMMTEL;
  }
  public QueryResult with_COMMTEL(String COMMTEL) {
    this.COMMTEL = COMMTEL;
    return this;
  }
  private String ORGPATH;
  public String get_ORGPATH() {
    return ORGPATH;
  }
  public void set_ORGPATH(String ORGPATH) {
    this.ORGPATH = ORGPATH;
  }
  public QueryResult with_ORGPATH(String ORGPATH) {
    this.ORGPATH = ORGPATH;
    return this;
  }
  private String GEOM;
  public String get_GEOM() {
    return GEOM;
  }
  public void set_GEOM(String GEOM) {
    this.GEOM = GEOM;
  }
  public QueryResult with_GEOM(String GEOM) {
    this.GEOM = GEOM;
    return this;
  }
  private String GID;
  public String get_GID() {
    return GID;
  }
  public void set_GID(String GID) {
    this.GID = GID;
  }
  public QueryResult with_GID(String GID) {
    this.GID = GID;
    return this;
  }
  private String ISLOCATE;
  public String get_ISLOCATE() {
    return ISLOCATE;
  }
  public void set_ISLOCATE(String ISLOCATE) {
    this.ISLOCATE = ISLOCATE;
  }
  public QueryResult with_ISLOCATE(String ISLOCATE) {
    this.ISLOCATE = ISLOCATE;
    return this;
  }
  private java.math.BigDecimal MAPSAMLLTYPEID;
  public java.math.BigDecimal get_MAPSAMLLTYPEID() {
    return MAPSAMLLTYPEID;
  }
  public void set_MAPSAMLLTYPEID(java.math.BigDecimal MAPSAMLLTYPEID) {
    this.MAPSAMLLTYPEID = MAPSAMLLTYPEID;
  }
  public QueryResult with_MAPSAMLLTYPEID(java.math.BigDecimal MAPSAMLLTYPEID) {
    this.MAPSAMLLTYPEID = MAPSAMLLTYPEID;
    return this;
  }
  private String MAPSAMLLTYPENAME;
  public String get_MAPSAMLLTYPENAME() {
    return MAPSAMLLTYPENAME;
  }
  public void set_MAPSAMLLTYPENAME(String MAPSAMLLTYPENAME) {
    this.MAPSAMLLTYPENAME = MAPSAMLLTYPENAME;
  }
  public QueryResult with_MAPSAMLLTYPENAME(String MAPSAMLLTYPENAME) {
    this.MAPSAMLLTYPENAME = MAPSAMLLTYPENAME;
    return this;
  }
  private String MAPBIGTYPENAME;
  public String get_MAPBIGTYPENAME() {
    return MAPBIGTYPENAME;
  }
  public void set_MAPBIGTYPENAME(String MAPBIGTYPENAME) {
    this.MAPBIGTYPENAME = MAPBIGTYPENAME;
  }
  public QueryResult with_MAPBIGTYPENAME(String MAPBIGTYPENAME) {
    this.MAPBIGTYPENAME = MAPBIGTYPENAME;
    return this;
  }
  private java.math.BigDecimal MAPBIGTYPEID;
  public java.math.BigDecimal get_MAPBIGTYPEID() {
    return MAPBIGTYPEID;
  }
  public void set_MAPBIGTYPEID(java.math.BigDecimal MAPBIGTYPEID) {
    this.MAPBIGTYPEID = MAPBIGTYPEID;
  }
  public QueryResult with_MAPBIGTYPEID(java.math.BigDecimal MAPBIGTYPEID) {
    this.MAPBIGTYPEID = MAPBIGTYPEID;
    return this;
  }
  private String ISBUSINE;
  public String get_ISBUSINE() {
    return ISBUSINE;
  }
  public void set_ISBUSINE(String ISBUSINE) {
    this.ISBUSINE = ISBUSINE;
  }
  public QueryResult with_ISBUSINE(String ISBUSINE) {
    this.ISBUSINE = ISBUSINE;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.REGION == null ? that.REGION == null : this.REGION.equals(that.REGION));
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.ORGID == null ? that.ORGID == null : this.ORGID.equals(that.ORGID));
    equal = equal && (this.ORGNAME == null ? that.ORGNAME == null : this.ORGNAME.equals(that.ORGNAME));
    equal = equal && (this.GRIDID == null ? that.GRIDID == null : this.GRIDID.equals(that.GRIDID));
    equal = equal && (this.GRIDNAME == null ? that.GRIDNAME == null : this.GRIDNAME.equals(that.GRIDNAME));
    equal = equal && (this.BUILDINGGROUPID == null ? that.BUILDINGGROUPID == null : this.BUILDINGGROUPID.equals(that.BUILDINGGROUPID));
    equal = equal && (this.BUILDINGNAME == null ? that.BUILDINGNAME == null : this.BUILDINGNAME.equals(that.BUILDINGNAME));
    equal = equal && (this.CODENUMBER == null ? that.CODENUMBER == null : this.CODENUMBER.equals(that.CODENUMBER));
    equal = equal && (this.NAME == null ? that.NAME == null : this.NAME.equals(that.NAME));
    equal = equal && (this.BASEBUILDINGTYPEID == null ? that.BASEBUILDINGTYPEID == null : this.BASEBUILDINGTYPEID.equals(that.BASEBUILDINGTYPEID));
    equal = equal && (this.BASEBUILDINGTYPENAME == null ? that.BASEBUILDINGTYPENAME == null : this.BASEBUILDINGTYPENAME.equals(that.BASEBUILDINGTYPENAME));
    equal = equal && (this.BASEBUILDTYPEID == null ? that.BASEBUILDTYPEID == null : this.BASEBUILDTYPEID.equals(that.BASEBUILDTYPEID));
    equal = equal && (this.BASEBUILDTYPENAME == null ? that.BASEBUILDTYPENAME == null : this.BASEBUILDTYPENAME.equals(that.BASEBUILDTYPENAME));
    equal = equal && (this.BASESTRUCTUREID == null ? that.BASESTRUCTUREID == null : this.BASESTRUCTUREID.equals(that.BASESTRUCTUREID));
    equal = equal && (this.BASESTRUCTURENAME == null ? that.BASESTRUCTURENAME == null : this.BASESTRUCTURENAME.equals(that.BASESTRUCTURENAME));
    equal = equal && (this.NATUREID == null ? that.NATUREID == null : this.NATUREID.equals(that.NATUREID));
    equal = equal && (this.NATURENAME == null ? that.NATURENAME == null : this.NATURENAME.equals(that.NATURENAME));
    equal = equal && (this.HEIGHT == null ? that.HEIGHT == null : this.HEIGHT.equals(that.HEIGHT));
    equal = equal && (this.ADDRESS == null ? that.ADDRESS == null : this.ADDRESS.equals(that.ADDRESS));
    equal = equal && (this.USE == null ? that.USE == null : this.USE.equals(that.USE));
    equal = equal && (this.BUILTYEAR == null ? that.BUILTYEAR == null : this.BUILTYEAR.equals(that.BUILTYEAR));
    equal = equal && (this.STOREYABOVE == null ? that.STOREYABOVE == null : this.STOREYABOVE.equals(that.STOREYABOVE));
    equal = equal && (this.STOREYUNDER == null ? that.STOREYUNDER == null : this.STOREYUNDER.equals(that.STOREYUNDER));
    equal = equal && (this.ROOMNUMBYUNITFLOOR == null ? that.ROOMNUMBYUNITFLOOR == null : this.ROOMNUMBYUNITFLOOR.equals(that.ROOMNUMBYUNITFLOOR));
    equal = equal && (this.ROOMS == null ? that.ROOMS == null : this.ROOMS.equals(that.ROOMS));
    equal = equal && (this.UNITNUM == null ? that.UNITNUM == null : this.UNITNUM.equals(that.UNITNUM));
    equal = equal && (this.ISTOILET == null ? that.ISTOILET == null : this.ISTOILET.equals(that.ISTOILET));
    equal = equal && (this.ISWATERMETER == null ? that.ISWATERMETER == null : this.ISWATERMETER.equals(that.ISWATERMETER));
    equal = equal && (this.ISELECTRICMETER == null ? that.ISELECTRICMETER == null : this.ISELECTRICMETER.equals(that.ISELECTRICMETER));
    equal = equal && (this.ISIMPORTANTPLACE == null ? that.ISIMPORTANTPLACE == null : this.ISIMPORTANTPLACE.equals(that.ISIMPORTANTPLACE));
    equal = equal && (this.AREA == null ? that.AREA == null : this.AREA.equals(that.AREA));
    equal = equal && (this.COORDINATEID == null ? that.COORDINATEID == null : this.COORDINATEID.equals(that.COORDINATEID));
    equal = equal && (this.PHOTO == null ? that.PHOTO == null : this.PHOTO.equals(that.PHOTO));
    equal = equal && (this.REMARK == null ? that.REMARK == null : this.REMARK.equals(that.REMARK));
    equal = equal && (this.ATTRIBUTESTR == null ? that.ATTRIBUTESTR == null : this.ATTRIBUTESTR.equals(that.ATTRIBUTESTR));
    equal = equal && (this.CREATEUSER == null ? that.CREATEUSER == null : this.CREATEUSER.equals(that.CREATEUSER));
    equal = equal && (this.CREATETIME == null ? that.CREATETIME == null : this.CREATETIME.equals(that.CREATETIME));
    equal = equal && (this.UPDATEUSER == null ? that.UPDATEUSER == null : this.UPDATEUSER.equals(that.UPDATEUSER));
    equal = equal && (this.UPDATETIME == null ? that.UPDATETIME == null : this.UPDATETIME.equals(that.UPDATETIME));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.DF1 == null ? that.DF1 == null : this.DF1.equals(that.DF1));
    equal = equal && (this.DF2 == null ? that.DF2 == null : this.DF2.equals(that.DF2));
    equal = equal && (this.DF3 == null ? that.DF3 == null : this.DF3.equals(that.DF3));
    equal = equal && (this.DF4 == null ? that.DF4 == null : this.DF4.equals(that.DF4));
    equal = equal && (this.DF5 == null ? that.DF5 == null : this.DF5.equals(that.DF5));
    equal = equal && (this.DF6 == null ? that.DF6 == null : this.DF6.equals(that.DF6));
    equal = equal && (this.DF7 == null ? that.DF7 == null : this.DF7.equals(that.DF7));
    equal = equal && (this.DF8 == null ? that.DF8 == null : this.DF8.equals(that.DF8));
    equal = equal && (this.DF9 == null ? that.DF9 == null : this.DF9.equals(that.DF9));
    equal = equal && (this.DF10 == null ? that.DF10 == null : this.DF10.equals(that.DF10));
    equal = equal && (this.BUILDINGADMIN == null ? that.BUILDINGADMIN == null : this.BUILDINGADMIN.equals(that.BUILDINGADMIN));
    equal = equal && (this.BUILDINGCONTACT == null ? that.BUILDINGCONTACT == null : this.BUILDINGCONTACT.equals(that.BUILDINGCONTACT));
    equal = equal && (this.BUILDINGPOLICE == null ? that.BUILDINGPOLICE == null : this.BUILDINGPOLICE.equals(that.BUILDINGPOLICE));
    equal = equal && (this.BUILDINGPOLICETEL == null ? that.BUILDINGPOLICETEL == null : this.BUILDINGPOLICETEL.equals(that.BUILDINGPOLICETEL));
    equal = equal && (this.COMMANAGER == null ? that.COMMANAGER == null : this.COMMANAGER.equals(that.COMMANAGER));
    equal = equal && (this.COMMTEL == null ? that.COMMTEL == null : this.COMMTEL.equals(that.COMMTEL));
    equal = equal && (this.ORGPATH == null ? that.ORGPATH == null : this.ORGPATH.equals(that.ORGPATH));
    equal = equal && (this.GEOM == null ? that.GEOM == null : this.GEOM.equals(that.GEOM));
    equal = equal && (this.GID == null ? that.GID == null : this.GID.equals(that.GID));
    equal = equal && (this.ISLOCATE == null ? that.ISLOCATE == null : this.ISLOCATE.equals(that.ISLOCATE));
    equal = equal && (this.MAPSAMLLTYPEID == null ? that.MAPSAMLLTYPEID == null : this.MAPSAMLLTYPEID.equals(that.MAPSAMLLTYPEID));
    equal = equal && (this.MAPSAMLLTYPENAME == null ? that.MAPSAMLLTYPENAME == null : this.MAPSAMLLTYPENAME.equals(that.MAPSAMLLTYPENAME));
    equal = equal && (this.MAPBIGTYPENAME == null ? that.MAPBIGTYPENAME == null : this.MAPBIGTYPENAME.equals(that.MAPBIGTYPENAME));
    equal = equal && (this.MAPBIGTYPEID == null ? that.MAPBIGTYPEID == null : this.MAPBIGTYPEID.equals(that.MAPBIGTYPEID));
    equal = equal && (this.ISBUSINE == null ? that.ISBUSINE == null : this.ISBUSINE.equals(that.ISBUSINE));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof QueryResult)) {
      return false;
    }
    QueryResult that = (QueryResult) o;
    boolean equal = true;
    equal = equal && (this.REGION == null ? that.REGION == null : this.REGION.equals(that.REGION));
    equal = equal && (this.ID == null ? that.ID == null : this.ID.equals(that.ID));
    equal = equal && (this.ORGID == null ? that.ORGID == null : this.ORGID.equals(that.ORGID));
    equal = equal && (this.ORGNAME == null ? that.ORGNAME == null : this.ORGNAME.equals(that.ORGNAME));
    equal = equal && (this.GRIDID == null ? that.GRIDID == null : this.GRIDID.equals(that.GRIDID));
    equal = equal && (this.GRIDNAME == null ? that.GRIDNAME == null : this.GRIDNAME.equals(that.GRIDNAME));
    equal = equal && (this.BUILDINGGROUPID == null ? that.BUILDINGGROUPID == null : this.BUILDINGGROUPID.equals(that.BUILDINGGROUPID));
    equal = equal && (this.BUILDINGNAME == null ? that.BUILDINGNAME == null : this.BUILDINGNAME.equals(that.BUILDINGNAME));
    equal = equal && (this.CODENUMBER == null ? that.CODENUMBER == null : this.CODENUMBER.equals(that.CODENUMBER));
    equal = equal && (this.NAME == null ? that.NAME == null : this.NAME.equals(that.NAME));
    equal = equal && (this.BASEBUILDINGTYPEID == null ? that.BASEBUILDINGTYPEID == null : this.BASEBUILDINGTYPEID.equals(that.BASEBUILDINGTYPEID));
    equal = equal && (this.BASEBUILDINGTYPENAME == null ? that.BASEBUILDINGTYPENAME == null : this.BASEBUILDINGTYPENAME.equals(that.BASEBUILDINGTYPENAME));
    equal = equal && (this.BASEBUILDTYPEID == null ? that.BASEBUILDTYPEID == null : this.BASEBUILDTYPEID.equals(that.BASEBUILDTYPEID));
    equal = equal && (this.BASEBUILDTYPENAME == null ? that.BASEBUILDTYPENAME == null : this.BASEBUILDTYPENAME.equals(that.BASEBUILDTYPENAME));
    equal = equal && (this.BASESTRUCTUREID == null ? that.BASESTRUCTUREID == null : this.BASESTRUCTUREID.equals(that.BASESTRUCTUREID));
    equal = equal && (this.BASESTRUCTURENAME == null ? that.BASESTRUCTURENAME == null : this.BASESTRUCTURENAME.equals(that.BASESTRUCTURENAME));
    equal = equal && (this.NATUREID == null ? that.NATUREID == null : this.NATUREID.equals(that.NATUREID));
    equal = equal && (this.NATURENAME == null ? that.NATURENAME == null : this.NATURENAME.equals(that.NATURENAME));
    equal = equal && (this.HEIGHT == null ? that.HEIGHT == null : this.HEIGHT.equals(that.HEIGHT));
    equal = equal && (this.ADDRESS == null ? that.ADDRESS == null : this.ADDRESS.equals(that.ADDRESS));
    equal = equal && (this.USE == null ? that.USE == null : this.USE.equals(that.USE));
    equal = equal && (this.BUILTYEAR == null ? that.BUILTYEAR == null : this.BUILTYEAR.equals(that.BUILTYEAR));
    equal = equal && (this.STOREYABOVE == null ? that.STOREYABOVE == null : this.STOREYABOVE.equals(that.STOREYABOVE));
    equal = equal && (this.STOREYUNDER == null ? that.STOREYUNDER == null : this.STOREYUNDER.equals(that.STOREYUNDER));
    equal = equal && (this.ROOMNUMBYUNITFLOOR == null ? that.ROOMNUMBYUNITFLOOR == null : this.ROOMNUMBYUNITFLOOR.equals(that.ROOMNUMBYUNITFLOOR));
    equal = equal && (this.ROOMS == null ? that.ROOMS == null : this.ROOMS.equals(that.ROOMS));
    equal = equal && (this.UNITNUM == null ? that.UNITNUM == null : this.UNITNUM.equals(that.UNITNUM));
    equal = equal && (this.ISTOILET == null ? that.ISTOILET == null : this.ISTOILET.equals(that.ISTOILET));
    equal = equal && (this.ISWATERMETER == null ? that.ISWATERMETER == null : this.ISWATERMETER.equals(that.ISWATERMETER));
    equal = equal && (this.ISELECTRICMETER == null ? that.ISELECTRICMETER == null : this.ISELECTRICMETER.equals(that.ISELECTRICMETER));
    equal = equal && (this.ISIMPORTANTPLACE == null ? that.ISIMPORTANTPLACE == null : this.ISIMPORTANTPLACE.equals(that.ISIMPORTANTPLACE));
    equal = equal && (this.AREA == null ? that.AREA == null : this.AREA.equals(that.AREA));
    equal = equal && (this.COORDINATEID == null ? that.COORDINATEID == null : this.COORDINATEID.equals(that.COORDINATEID));
    equal = equal && (this.PHOTO == null ? that.PHOTO == null : this.PHOTO.equals(that.PHOTO));
    equal = equal && (this.REMARK == null ? that.REMARK == null : this.REMARK.equals(that.REMARK));
    equal = equal && (this.ATTRIBUTESTR == null ? that.ATTRIBUTESTR == null : this.ATTRIBUTESTR.equals(that.ATTRIBUTESTR));
    equal = equal && (this.CREATEUSER == null ? that.CREATEUSER == null : this.CREATEUSER.equals(that.CREATEUSER));
    equal = equal && (this.CREATETIME == null ? that.CREATETIME == null : this.CREATETIME.equals(that.CREATETIME));
    equal = equal && (this.UPDATEUSER == null ? that.UPDATEUSER == null : this.UPDATEUSER.equals(that.UPDATEUSER));
    equal = equal && (this.UPDATETIME == null ? that.UPDATETIME == null : this.UPDATETIME.equals(that.UPDATETIME));
    equal = equal && (this.VERSION == null ? that.VERSION == null : this.VERSION.equals(that.VERSION));
    equal = equal && (this.DF1 == null ? that.DF1 == null : this.DF1.equals(that.DF1));
    equal = equal && (this.DF2 == null ? that.DF2 == null : this.DF2.equals(that.DF2));
    equal = equal && (this.DF3 == null ? that.DF3 == null : this.DF3.equals(that.DF3));
    equal = equal && (this.DF4 == null ? that.DF4 == null : this.DF4.equals(that.DF4));
    equal = equal && (this.DF5 == null ? that.DF5 == null : this.DF5.equals(that.DF5));
    equal = equal && (this.DF6 == null ? that.DF6 == null : this.DF6.equals(that.DF6));
    equal = equal && (this.DF7 == null ? that.DF7 == null : this.DF7.equals(that.DF7));
    equal = equal && (this.DF8 == null ? that.DF8 == null : this.DF8.equals(that.DF8));
    equal = equal && (this.DF9 == null ? that.DF9 == null : this.DF9.equals(that.DF9));
    equal = equal && (this.DF10 == null ? that.DF10 == null : this.DF10.equals(that.DF10));
    equal = equal && (this.BUILDINGADMIN == null ? that.BUILDINGADMIN == null : this.BUILDINGADMIN.equals(that.BUILDINGADMIN));
    equal = equal && (this.BUILDINGCONTACT == null ? that.BUILDINGCONTACT == null : this.BUILDINGCONTACT.equals(that.BUILDINGCONTACT));
    equal = equal && (this.BUILDINGPOLICE == null ? that.BUILDINGPOLICE == null : this.BUILDINGPOLICE.equals(that.BUILDINGPOLICE));
    equal = equal && (this.BUILDINGPOLICETEL == null ? that.BUILDINGPOLICETEL == null : this.BUILDINGPOLICETEL.equals(that.BUILDINGPOLICETEL));
    equal = equal && (this.COMMANAGER == null ? that.COMMANAGER == null : this.COMMANAGER.equals(that.COMMANAGER));
    equal = equal && (this.COMMTEL == null ? that.COMMTEL == null : this.COMMTEL.equals(that.COMMTEL));
    equal = equal && (this.ORGPATH == null ? that.ORGPATH == null : this.ORGPATH.equals(that.ORGPATH));
    equal = equal && (this.GEOM == null ? that.GEOM == null : this.GEOM.equals(that.GEOM));
    equal = equal && (this.GID == null ? that.GID == null : this.GID.equals(that.GID));
    equal = equal && (this.ISLOCATE == null ? that.ISLOCATE == null : this.ISLOCATE.equals(that.ISLOCATE));
    equal = equal && (this.MAPSAMLLTYPEID == null ? that.MAPSAMLLTYPEID == null : this.MAPSAMLLTYPEID.equals(that.MAPSAMLLTYPEID));
    equal = equal && (this.MAPSAMLLTYPENAME == null ? that.MAPSAMLLTYPENAME == null : this.MAPSAMLLTYPENAME.equals(that.MAPSAMLLTYPENAME));
    equal = equal && (this.MAPBIGTYPENAME == null ? that.MAPBIGTYPENAME == null : this.MAPBIGTYPENAME.equals(that.MAPBIGTYPENAME));
    equal = equal && (this.MAPBIGTYPEID == null ? that.MAPBIGTYPEID == null : this.MAPBIGTYPEID.equals(that.MAPBIGTYPEID));
    equal = equal && (this.ISBUSINE == null ? that.ISBUSINE == null : this.ISBUSINE.equals(that.ISBUSINE));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.REGION = JdbcWritableBridge.readString(1, __dbResults);
    this.ID = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ORGID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.ORGNAME = JdbcWritableBridge.readString(4, __dbResults);
    this.GRIDID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.GRIDNAME = JdbcWritableBridge.readString(6, __dbResults);
    this.BUILDINGGROUPID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.BUILDINGNAME = JdbcWritableBridge.readString(8, __dbResults);
    this.CODENUMBER = JdbcWritableBridge.readString(9, __dbResults);
    this.NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.BASEBUILDINGTYPEID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.BASEBUILDINGTYPENAME = JdbcWritableBridge.readString(12, __dbResults);
    this.BASEBUILDTYPEID = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.BASEBUILDTYPENAME = JdbcWritableBridge.readString(14, __dbResults);
    this.BASESTRUCTUREID = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.BASESTRUCTURENAME = JdbcWritableBridge.readString(16, __dbResults);
    this.NATUREID = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.NATURENAME = JdbcWritableBridge.readString(18, __dbResults);
    this.HEIGHT = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.ADDRESS = JdbcWritableBridge.readString(20, __dbResults);
    this.USE = JdbcWritableBridge.readString(21, __dbResults);
    this.BUILTYEAR = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.STOREYABOVE = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.STOREYUNDER = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ROOMNUMBYUNITFLOOR = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ROOMS = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.UNITNUM = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.ISTOILET = JdbcWritableBridge.readString(28, __dbResults);
    this.ISWATERMETER = JdbcWritableBridge.readString(29, __dbResults);
    this.ISELECTRICMETER = JdbcWritableBridge.readString(30, __dbResults);
    this.ISIMPORTANTPLACE = JdbcWritableBridge.readString(31, __dbResults);
    this.AREA = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.COORDINATEID = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.PHOTO = JdbcWritableBridge.readString(34, __dbResults);
    this.REMARK = JdbcWritableBridge.readString(35, __dbResults);
    this.ATTRIBUTESTR = JdbcWritableBridge.readString(36, __dbResults);
    this.CREATEUSER = JdbcWritableBridge.readString(37, __dbResults);
    this.CREATETIME = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.UPDATEUSER = JdbcWritableBridge.readString(39, __dbResults);
    this.UPDATETIME = JdbcWritableBridge.readTimestamp(40, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.DF1 = JdbcWritableBridge.readString(42, __dbResults);
    this.DF2 = JdbcWritableBridge.readString(43, __dbResults);
    this.DF3 = JdbcWritableBridge.readString(44, __dbResults);
    this.DF4 = JdbcWritableBridge.readString(45, __dbResults);
    this.DF5 = JdbcWritableBridge.readString(46, __dbResults);
    this.DF6 = JdbcWritableBridge.readString(47, __dbResults);
    this.DF7 = JdbcWritableBridge.readString(48, __dbResults);
    this.DF8 = JdbcWritableBridge.readString(49, __dbResults);
    this.DF9 = JdbcWritableBridge.readString(50, __dbResults);
    this.DF10 = JdbcWritableBridge.readString(51, __dbResults);
    this.BUILDINGADMIN = JdbcWritableBridge.readString(52, __dbResults);
    this.BUILDINGCONTACT = JdbcWritableBridge.readString(53, __dbResults);
    this.BUILDINGPOLICE = JdbcWritableBridge.readString(54, __dbResults);
    this.BUILDINGPOLICETEL = JdbcWritableBridge.readString(55, __dbResults);
    this.COMMANAGER = JdbcWritableBridge.readString(56, __dbResults);
    this.COMMTEL = JdbcWritableBridge.readString(57, __dbResults);
    this.ORGPATH = JdbcWritableBridge.readString(58, __dbResults);
    this.GEOM = JdbcWritableBridge.readString(59, __dbResults);
    this.GID = JdbcWritableBridge.readString(60, __dbResults);
    this.ISLOCATE = JdbcWritableBridge.readString(61, __dbResults);
    this.MAPSAMLLTYPEID = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.MAPSAMLLTYPENAME = JdbcWritableBridge.readString(63, __dbResults);
    this.MAPBIGTYPENAME = JdbcWritableBridge.readString(64, __dbResults);
    this.MAPBIGTYPEID = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.ISBUSINE = JdbcWritableBridge.readString(66, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.REGION = JdbcWritableBridge.readString(1, __dbResults);
    this.ID = JdbcWritableBridge.readBigDecimal(2, __dbResults);
    this.ORGID = JdbcWritableBridge.readBigDecimal(3, __dbResults);
    this.ORGNAME = JdbcWritableBridge.readString(4, __dbResults);
    this.GRIDID = JdbcWritableBridge.readBigDecimal(5, __dbResults);
    this.GRIDNAME = JdbcWritableBridge.readString(6, __dbResults);
    this.BUILDINGGROUPID = JdbcWritableBridge.readBigDecimal(7, __dbResults);
    this.BUILDINGNAME = JdbcWritableBridge.readString(8, __dbResults);
    this.CODENUMBER = JdbcWritableBridge.readString(9, __dbResults);
    this.NAME = JdbcWritableBridge.readString(10, __dbResults);
    this.BASEBUILDINGTYPEID = JdbcWritableBridge.readBigDecimal(11, __dbResults);
    this.BASEBUILDINGTYPENAME = JdbcWritableBridge.readString(12, __dbResults);
    this.BASEBUILDTYPEID = JdbcWritableBridge.readBigDecimal(13, __dbResults);
    this.BASEBUILDTYPENAME = JdbcWritableBridge.readString(14, __dbResults);
    this.BASESTRUCTUREID = JdbcWritableBridge.readBigDecimal(15, __dbResults);
    this.BASESTRUCTURENAME = JdbcWritableBridge.readString(16, __dbResults);
    this.NATUREID = JdbcWritableBridge.readBigDecimal(17, __dbResults);
    this.NATURENAME = JdbcWritableBridge.readString(18, __dbResults);
    this.HEIGHT = JdbcWritableBridge.readBigDecimal(19, __dbResults);
    this.ADDRESS = JdbcWritableBridge.readString(20, __dbResults);
    this.USE = JdbcWritableBridge.readString(21, __dbResults);
    this.BUILTYEAR = JdbcWritableBridge.readBigDecimal(22, __dbResults);
    this.STOREYABOVE = JdbcWritableBridge.readBigDecimal(23, __dbResults);
    this.STOREYUNDER = JdbcWritableBridge.readBigDecimal(24, __dbResults);
    this.ROOMNUMBYUNITFLOOR = JdbcWritableBridge.readBigDecimal(25, __dbResults);
    this.ROOMS = JdbcWritableBridge.readBigDecimal(26, __dbResults);
    this.UNITNUM = JdbcWritableBridge.readBigDecimal(27, __dbResults);
    this.ISTOILET = JdbcWritableBridge.readString(28, __dbResults);
    this.ISWATERMETER = JdbcWritableBridge.readString(29, __dbResults);
    this.ISELECTRICMETER = JdbcWritableBridge.readString(30, __dbResults);
    this.ISIMPORTANTPLACE = JdbcWritableBridge.readString(31, __dbResults);
    this.AREA = JdbcWritableBridge.readBigDecimal(32, __dbResults);
    this.COORDINATEID = JdbcWritableBridge.readBigDecimal(33, __dbResults);
    this.PHOTO = JdbcWritableBridge.readString(34, __dbResults);
    this.REMARK = JdbcWritableBridge.readString(35, __dbResults);
    this.ATTRIBUTESTR = JdbcWritableBridge.readString(36, __dbResults);
    this.CREATEUSER = JdbcWritableBridge.readString(37, __dbResults);
    this.CREATETIME = JdbcWritableBridge.readTimestamp(38, __dbResults);
    this.UPDATEUSER = JdbcWritableBridge.readString(39, __dbResults);
    this.UPDATETIME = JdbcWritableBridge.readTimestamp(40, __dbResults);
    this.VERSION = JdbcWritableBridge.readBigDecimal(41, __dbResults);
    this.DF1 = JdbcWritableBridge.readString(42, __dbResults);
    this.DF2 = JdbcWritableBridge.readString(43, __dbResults);
    this.DF3 = JdbcWritableBridge.readString(44, __dbResults);
    this.DF4 = JdbcWritableBridge.readString(45, __dbResults);
    this.DF5 = JdbcWritableBridge.readString(46, __dbResults);
    this.DF6 = JdbcWritableBridge.readString(47, __dbResults);
    this.DF7 = JdbcWritableBridge.readString(48, __dbResults);
    this.DF8 = JdbcWritableBridge.readString(49, __dbResults);
    this.DF9 = JdbcWritableBridge.readString(50, __dbResults);
    this.DF10 = JdbcWritableBridge.readString(51, __dbResults);
    this.BUILDINGADMIN = JdbcWritableBridge.readString(52, __dbResults);
    this.BUILDINGCONTACT = JdbcWritableBridge.readString(53, __dbResults);
    this.BUILDINGPOLICE = JdbcWritableBridge.readString(54, __dbResults);
    this.BUILDINGPOLICETEL = JdbcWritableBridge.readString(55, __dbResults);
    this.COMMANAGER = JdbcWritableBridge.readString(56, __dbResults);
    this.COMMTEL = JdbcWritableBridge.readString(57, __dbResults);
    this.ORGPATH = JdbcWritableBridge.readString(58, __dbResults);
    this.GEOM = JdbcWritableBridge.readString(59, __dbResults);
    this.GID = JdbcWritableBridge.readString(60, __dbResults);
    this.ISLOCATE = JdbcWritableBridge.readString(61, __dbResults);
    this.MAPSAMLLTYPEID = JdbcWritableBridge.readBigDecimal(62, __dbResults);
    this.MAPSAMLLTYPENAME = JdbcWritableBridge.readString(63, __dbResults);
    this.MAPBIGTYPENAME = JdbcWritableBridge.readString(64, __dbResults);
    this.MAPBIGTYPEID = JdbcWritableBridge.readBigDecimal(65, __dbResults);
    this.ISBUSINE = JdbcWritableBridge.readString(66, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void loadLargeObjects0(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(REGION, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ID, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORGID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ORGNAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GRIDID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(GRIDNAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUILDINGGROUPID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGNAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CODENUMBER, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BASEBUILDINGTYPEID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BASEBUILDINGTYPENAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BASEBUILDTYPEID, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BASEBUILDTYPENAME, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BASESTRUCTUREID, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BASESTRUCTURENAME, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NATUREID, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(NATURENAME, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HEIGHT, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ADDRESS, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(USE, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUILTYEAR, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(STOREYABOVE, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(STOREYUNDER, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ROOMNUMBYUNITFLOOR, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ROOMS, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNITNUM, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ISTOILET, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISWATERMETER, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISELECTRICMETER, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISIMPORTANTPLACE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AREA, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COORDINATEID, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PHOTO, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REMARK, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ATTRIBUTESTR, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CREATEUSER, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CREATETIME, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(UPDATEUSER, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATETIME, 40 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DF1, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF2, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF3, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF4, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF5, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF6, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF7, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF8, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF9, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF10, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGADMIN, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGCONTACT, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGPOLICE, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGPOLICETEL, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMANAGER, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMTEL, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORGPATH, 58 + __off, 12, __dbStmt);
__dbStmt.setString(59, GEOM);
    JdbcWritableBridge.writeString(GID, 60 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ISLOCATE, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAPSAMLLTYPEID, 62 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAPSAMLLTYPENAME, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAPBIGTYPENAME, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAPBIGTYPEID, 65 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ISBUSINE, 66 + __off, 12, __dbStmt);
    return 66;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(REGION, 1 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ID, 2 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ORGID, 3 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ORGNAME, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(GRIDID, 5 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(GRIDNAME, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUILDINGGROUPID, 7 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGNAME, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CODENUMBER, 9 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(NAME, 10 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BASEBUILDINGTYPEID, 11 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BASEBUILDINGTYPENAME, 12 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BASEBUILDTYPEID, 13 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BASEBUILDTYPENAME, 14 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BASESTRUCTUREID, 15 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(BASESTRUCTURENAME, 16 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(NATUREID, 17 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(NATURENAME, 18 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(HEIGHT, 19 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ADDRESS, 20 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(USE, 21 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(BUILTYEAR, 22 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(STOREYABOVE, 23 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(STOREYUNDER, 24 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ROOMNUMBYUNITFLOOR, 25 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(ROOMS, 26 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(UNITNUM, 27 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ISTOILET, 28 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISWATERMETER, 29 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISELECTRICMETER, 30 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ISIMPORTANTPLACE, 31 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(AREA, 32 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(COORDINATEID, 33 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(PHOTO, 34 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(REMARK, 35 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ATTRIBUTESTR, 36 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(CREATEUSER, 37 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(CREATETIME, 38 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeString(UPDATEUSER, 39 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeTimestamp(UPDATETIME, 40 + __off, 93, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(VERSION, 41 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(DF1, 42 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF2, 43 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF3, 44 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF4, 45 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF5, 46 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF6, 47 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF7, 48 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF8, 49 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF9, 50 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(DF10, 51 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGADMIN, 52 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGCONTACT, 53 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGPOLICE, 54 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(BUILDINGPOLICETEL, 55 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMANAGER, 56 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(COMMTEL, 57 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(ORGPATH, 58 + __off, 12, __dbStmt);
__dbStmt.setString(59, GEOM);
    JdbcWritableBridge.writeString(GID, 60 + __off, 1, __dbStmt);
    JdbcWritableBridge.writeString(ISLOCATE, 61 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAPSAMLLTYPEID, 62 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(MAPSAMLLTYPENAME, 63 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(MAPBIGTYPENAME, 64 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeBigDecimal(MAPBIGTYPEID, 65 + __off, 2, __dbStmt);
    JdbcWritableBridge.writeString(ISBUSINE, 66 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.REGION = null;
    } else {
    this.REGION = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ID = null;
    } else {
    this.ID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORGID = null;
    } else {
    this.ORGID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORGNAME = null;
    } else {
    this.ORGNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GRIDID = null;
    } else {
    this.GRIDID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GRIDNAME = null;
    } else {
    this.GRIDNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUILDINGGROUPID = null;
    } else {
    this.BUILDINGGROUPID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUILDINGNAME = null;
    } else {
    this.BUILDINGNAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CODENUMBER = null;
    } else {
    this.CODENUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NAME = null;
    } else {
    this.NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BASEBUILDINGTYPEID = null;
    } else {
    this.BASEBUILDINGTYPEID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BASEBUILDINGTYPENAME = null;
    } else {
    this.BASEBUILDINGTYPENAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BASEBUILDTYPEID = null;
    } else {
    this.BASEBUILDTYPEID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BASEBUILDTYPENAME = null;
    } else {
    this.BASEBUILDTYPENAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BASESTRUCTUREID = null;
    } else {
    this.BASESTRUCTUREID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BASESTRUCTURENAME = null;
    } else {
    this.BASESTRUCTURENAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NATUREID = null;
    } else {
    this.NATUREID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.NATURENAME = null;
    } else {
    this.NATURENAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HEIGHT = null;
    } else {
    this.HEIGHT = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ADDRESS = null;
    } else {
    this.ADDRESS = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.USE = null;
    } else {
    this.USE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUILTYEAR = null;
    } else {
    this.BUILTYEAR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STOREYABOVE = null;
    } else {
    this.STOREYABOVE = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.STOREYUNDER = null;
    } else {
    this.STOREYUNDER = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ROOMNUMBYUNITFLOOR = null;
    } else {
    this.ROOMNUMBYUNITFLOOR = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ROOMS = null;
    } else {
    this.ROOMS = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UNITNUM = null;
    } else {
    this.UNITNUM = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISTOILET = null;
    } else {
    this.ISTOILET = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISWATERMETER = null;
    } else {
    this.ISWATERMETER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISELECTRICMETER = null;
    } else {
    this.ISELECTRICMETER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISIMPORTANTPLACE = null;
    } else {
    this.ISIMPORTANTPLACE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.AREA = null;
    } else {
    this.AREA = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COORDINATEID = null;
    } else {
    this.COORDINATEID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHOTO = null;
    } else {
    this.PHOTO = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.REMARK = null;
    } else {
    this.REMARK = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ATTRIBUTESTR = null;
    } else {
    this.ATTRIBUTESTR = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREATEUSER = null;
    } else {
    this.CREATEUSER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.CREATETIME = null;
    } else {
    this.CREATETIME = new Timestamp(__dataIn.readLong());
    this.CREATETIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.UPDATEUSER = null;
    } else {
    this.UPDATEUSER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.UPDATETIME = null;
    } else {
    this.UPDATETIME = new Timestamp(__dataIn.readLong());
    this.UPDATETIME.setNanos(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.VERSION = null;
    } else {
    this.VERSION = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF1 = null;
    } else {
    this.DF1 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF2 = null;
    } else {
    this.DF2 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF3 = null;
    } else {
    this.DF3 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF4 = null;
    } else {
    this.DF4 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF5 = null;
    } else {
    this.DF5 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF6 = null;
    } else {
    this.DF6 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF7 = null;
    } else {
    this.DF7 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF8 = null;
    } else {
    this.DF8 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF9 = null;
    } else {
    this.DF9 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.DF10 = null;
    } else {
    this.DF10 = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUILDINGADMIN = null;
    } else {
    this.BUILDINGADMIN = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUILDINGCONTACT = null;
    } else {
    this.BUILDINGCONTACT = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUILDINGPOLICE = null;
    } else {
    this.BUILDINGPOLICE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.BUILDINGPOLICETEL = null;
    } else {
    this.BUILDINGPOLICETEL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMANAGER = null;
    } else {
    this.COMMANAGER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.COMMTEL = null;
    } else {
    this.COMMTEL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ORGPATH = null;
    } else {
    this.ORGPATH = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GEOM = null;
    } else {
    this.GEOM = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.GID = null;
    } else {
    this.GID = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISLOCATE = null;
    } else {
    this.ISLOCATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAPSAMLLTYPEID = null;
    } else {
    this.MAPSAMLLTYPEID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAPSAMLLTYPENAME = null;
    } else {
    this.MAPSAMLLTYPENAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAPBIGTYPENAME = null;
    } else {
    this.MAPBIGTYPENAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.MAPBIGTYPEID = null;
    } else {
    this.MAPBIGTYPEID = com.cloudera.sqoop.lib.BigDecimalSerializer.readFields(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.ISBUSINE = null;
    } else {
    this.ISBUSINE = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.REGION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION);
    }
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.ORGID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORGID, __dataOut);
    }
    if (null == this.ORGNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORGNAME);
    }
    if (null == this.GRIDID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GRIDID, __dataOut);
    }
    if (null == this.GRIDNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRIDNAME);
    }
    if (null == this.BUILDINGGROUPID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUILDINGGROUPID, __dataOut);
    }
    if (null == this.BUILDINGNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGNAME);
    }
    if (null == this.CODENUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CODENUMBER);
    }
    if (null == this.NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NAME);
    }
    if (null == this.BASEBUILDINGTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BASEBUILDINGTYPEID, __dataOut);
    }
    if (null == this.BASEBUILDINGTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASEBUILDINGTYPENAME);
    }
    if (null == this.BASEBUILDTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BASEBUILDTYPEID, __dataOut);
    }
    if (null == this.BASEBUILDTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASEBUILDTYPENAME);
    }
    if (null == this.BASESTRUCTUREID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BASESTRUCTUREID, __dataOut);
    }
    if (null == this.BASESTRUCTURENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASESTRUCTURENAME);
    }
    if (null == this.NATUREID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NATUREID, __dataOut);
    }
    if (null == this.NATURENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NATURENAME);
    }
    if (null == this.HEIGHT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HEIGHT, __dataOut);
    }
    if (null == this.ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRESS);
    }
    if (null == this.USE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, USE);
    }
    if (null == this.BUILTYEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUILTYEAR, __dataOut);
    }
    if (null == this.STOREYABOVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.STOREYABOVE, __dataOut);
    }
    if (null == this.STOREYUNDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.STOREYUNDER, __dataOut);
    }
    if (null == this.ROOMNUMBYUNITFLOOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ROOMNUMBYUNITFLOOR, __dataOut);
    }
    if (null == this.ROOMS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ROOMS, __dataOut);
    }
    if (null == this.UNITNUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNITNUM, __dataOut);
    }
    if (null == this.ISTOILET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISTOILET);
    }
    if (null == this.ISWATERMETER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISWATERMETER);
    }
    if (null == this.ISELECTRICMETER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISELECTRICMETER);
    }
    if (null == this.ISIMPORTANTPLACE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISIMPORTANTPLACE);
    }
    if (null == this.AREA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AREA, __dataOut);
    }
    if (null == this.COORDINATEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COORDINATEID, __dataOut);
    }
    if (null == this.PHOTO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHOTO);
    }
    if (null == this.REMARK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REMARK);
    }
    if (null == this.ATTRIBUTESTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ATTRIBUTESTR);
    }
    if (null == this.CREATEUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREATEUSER);
    }
    if (null == this.CREATETIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CREATETIME.getTime());
    __dataOut.writeInt(this.CREATETIME.getNanos());
    }
    if (null == this.UPDATEUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UPDATEUSER);
    }
    if (null == this.UPDATETIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATETIME.getTime());
    __dataOut.writeInt(this.UPDATETIME.getNanos());
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
    }
    if (null == this.DF1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF1);
    }
    if (null == this.DF2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF2);
    }
    if (null == this.DF3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF3);
    }
    if (null == this.DF4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF4);
    }
    if (null == this.DF5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF5);
    }
    if (null == this.DF6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF6);
    }
    if (null == this.DF7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF7);
    }
    if (null == this.DF8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF8);
    }
    if (null == this.DF9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF9);
    }
    if (null == this.DF10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF10);
    }
    if (null == this.BUILDINGADMIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGADMIN);
    }
    if (null == this.BUILDINGCONTACT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGCONTACT);
    }
    if (null == this.BUILDINGPOLICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGPOLICE);
    }
    if (null == this.BUILDINGPOLICETEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGPOLICETEL);
    }
    if (null == this.COMMANAGER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMANAGER);
    }
    if (null == this.COMMTEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMTEL);
    }
    if (null == this.ORGPATH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORGPATH);
    }
    if (null == this.GEOM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GEOM);
    }
    if (null == this.GID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GID);
    }
    if (null == this.ISLOCATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISLOCATE);
    }
    if (null == this.MAPSAMLLTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAPSAMLLTYPEID, __dataOut);
    }
    if (null == this.MAPSAMLLTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAPSAMLLTYPENAME);
    }
    if (null == this.MAPBIGTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAPBIGTYPENAME);
    }
    if (null == this.MAPBIGTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAPBIGTYPEID, __dataOut);
    }
    if (null == this.ISBUSINE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISBUSINE);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.REGION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REGION);
    }
    if (null == this.ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ID, __dataOut);
    }
    if (null == this.ORGID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ORGID, __dataOut);
    }
    if (null == this.ORGNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORGNAME);
    }
    if (null == this.GRIDID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.GRIDID, __dataOut);
    }
    if (null == this.GRIDNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GRIDNAME);
    }
    if (null == this.BUILDINGGROUPID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUILDINGGROUPID, __dataOut);
    }
    if (null == this.BUILDINGNAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGNAME);
    }
    if (null == this.CODENUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CODENUMBER);
    }
    if (null == this.NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NAME);
    }
    if (null == this.BASEBUILDINGTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BASEBUILDINGTYPEID, __dataOut);
    }
    if (null == this.BASEBUILDINGTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASEBUILDINGTYPENAME);
    }
    if (null == this.BASEBUILDTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BASEBUILDTYPEID, __dataOut);
    }
    if (null == this.BASEBUILDTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASEBUILDTYPENAME);
    }
    if (null == this.BASESTRUCTUREID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BASESTRUCTUREID, __dataOut);
    }
    if (null == this.BASESTRUCTURENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BASESTRUCTURENAME);
    }
    if (null == this.NATUREID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.NATUREID, __dataOut);
    }
    if (null == this.NATURENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, NATURENAME);
    }
    if (null == this.HEIGHT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.HEIGHT, __dataOut);
    }
    if (null == this.ADDRESS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ADDRESS);
    }
    if (null == this.USE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, USE);
    }
    if (null == this.BUILTYEAR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.BUILTYEAR, __dataOut);
    }
    if (null == this.STOREYABOVE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.STOREYABOVE, __dataOut);
    }
    if (null == this.STOREYUNDER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.STOREYUNDER, __dataOut);
    }
    if (null == this.ROOMNUMBYUNITFLOOR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ROOMNUMBYUNITFLOOR, __dataOut);
    }
    if (null == this.ROOMS) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.ROOMS, __dataOut);
    }
    if (null == this.UNITNUM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.UNITNUM, __dataOut);
    }
    if (null == this.ISTOILET) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISTOILET);
    }
    if (null == this.ISWATERMETER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISWATERMETER);
    }
    if (null == this.ISELECTRICMETER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISELECTRICMETER);
    }
    if (null == this.ISIMPORTANTPLACE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISIMPORTANTPLACE);
    }
    if (null == this.AREA) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.AREA, __dataOut);
    }
    if (null == this.COORDINATEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.COORDINATEID, __dataOut);
    }
    if (null == this.PHOTO) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHOTO);
    }
    if (null == this.REMARK) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, REMARK);
    }
    if (null == this.ATTRIBUTESTR) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ATTRIBUTESTR);
    }
    if (null == this.CREATEUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, CREATEUSER);
    }
    if (null == this.CREATETIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.CREATETIME.getTime());
    __dataOut.writeInt(this.CREATETIME.getNanos());
    }
    if (null == this.UPDATEUSER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, UPDATEUSER);
    }
    if (null == this.UPDATETIME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeLong(this.UPDATETIME.getTime());
    __dataOut.writeInt(this.UPDATETIME.getNanos());
    }
    if (null == this.VERSION) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.VERSION, __dataOut);
    }
    if (null == this.DF1) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF1);
    }
    if (null == this.DF2) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF2);
    }
    if (null == this.DF3) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF3);
    }
    if (null == this.DF4) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF4);
    }
    if (null == this.DF5) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF5);
    }
    if (null == this.DF6) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF6);
    }
    if (null == this.DF7) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF7);
    }
    if (null == this.DF8) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF8);
    }
    if (null == this.DF9) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF9);
    }
    if (null == this.DF10) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, DF10);
    }
    if (null == this.BUILDINGADMIN) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGADMIN);
    }
    if (null == this.BUILDINGCONTACT) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGCONTACT);
    }
    if (null == this.BUILDINGPOLICE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGPOLICE);
    }
    if (null == this.BUILDINGPOLICETEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, BUILDINGPOLICETEL);
    }
    if (null == this.COMMANAGER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMANAGER);
    }
    if (null == this.COMMTEL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, COMMTEL);
    }
    if (null == this.ORGPATH) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ORGPATH);
    }
    if (null == this.GEOM) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GEOM);
    }
    if (null == this.GID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, GID);
    }
    if (null == this.ISLOCATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISLOCATE);
    }
    if (null == this.MAPSAMLLTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAPSAMLLTYPEID, __dataOut);
    }
    if (null == this.MAPSAMLLTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAPSAMLLTYPENAME);
    }
    if (null == this.MAPBIGTYPENAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, MAPBIGTYPENAME);
    }
    if (null == this.MAPBIGTYPEID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    com.cloudera.sqoop.lib.BigDecimalSerializer.write(this.MAPBIGTYPEID, __dataOut);
    }
    if (null == this.ISBUSINE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, ISBUSINE);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(REGION==null?"null":REGION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORGID==null?"null":ORGID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORGNAME==null?"null":ORGNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRIDID==null?"null":GRIDID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRIDNAME==null?"null":GRIDNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGGROUPID==null?"null":BUILDINGGROUPID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGNAME==null?"null":BUILDINGNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CODENUMBER==null?"null":CODENUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NAME==null?"null":NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDINGTYPEID==null?"null":BASEBUILDINGTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDINGTYPENAME==null?"null":BASEBUILDINGTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDTYPEID==null?"null":BASEBUILDTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDTYPENAME==null?"null":BASEBUILDTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASESTRUCTUREID==null?"null":BASESTRUCTUREID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASESTRUCTURENAME==null?"null":BASESTRUCTURENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NATUREID==null?"null":NATUREID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NATURENAME==null?"null":NATURENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HEIGHT==null?"null":HEIGHT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDRESS==null?"null":ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USE==null?"null":USE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILTYEAR==null?"null":BUILTYEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOREYABOVE==null?"null":STOREYABOVE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOREYUNDER==null?"null":STOREYUNDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ROOMNUMBYUNITFLOOR==null?"null":ROOMNUMBYUNITFLOOR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ROOMS==null?"null":ROOMS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNITNUM==null?"null":UNITNUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISTOILET==null?"null":ISTOILET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISWATERMETER==null?"null":ISWATERMETER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISELECTRICMETER==null?"null":ISELECTRICMETER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISIMPORTANTPLACE==null?"null":ISIMPORTANTPLACE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA==null?"null":AREA.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COORDINATEID==null?"null":COORDINATEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PHOTO==null?"null":PHOTO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REMARK==null?"null":REMARK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ATTRIBUTESTR==null?"null":ATTRIBUTESTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATEUSER==null?"null":CREATEUSER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATETIME==null?"null":"" + CREATETIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATEUSER==null?"null":UPDATEUSER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATETIME==null?"null":"" + UPDATETIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"null":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF1==null?"null":DF1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF2==null?"null":DF2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF3==null?"null":DF3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF4==null?"null":DF4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF5==null?"null":DF5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF6==null?"null":DF6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF7==null?"null":DF7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF8==null?"null":DF8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF9==null?"null":DF9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF10==null?"null":DF10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGADMIN==null?"null":BUILDINGADMIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGCONTACT==null?"null":BUILDINGCONTACT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGPOLICE==null?"null":BUILDINGPOLICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGPOLICETEL==null?"null":BUILDINGPOLICETEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMANAGER==null?"null":COMMANAGER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMTEL==null?"null":COMMTEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORGPATH==null?"null":ORGPATH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GEOM==null?"null":GEOM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GID==null?"null":GID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISLOCATE==null?"null":ISLOCATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPSAMLLTYPEID==null?"null":MAPSAMLLTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPSAMLLTYPENAME==null?"null":MAPSAMLLTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPBIGTYPENAME==null?"null":MAPBIGTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPBIGTYPEID==null?"null":MAPBIGTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISBUSINE==null?"null":ISBUSINE, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(REGION==null?"null":REGION, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ID==null?"null":ID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORGID==null?"null":ORGID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORGNAME==null?"null":ORGNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRIDID==null?"null":GRIDID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GRIDNAME==null?"null":GRIDNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGGROUPID==null?"null":BUILDINGGROUPID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGNAME==null?"null":BUILDINGNAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CODENUMBER==null?"null":CODENUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NAME==null?"null":NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDINGTYPEID==null?"null":BASEBUILDINGTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDINGTYPENAME==null?"null":BASEBUILDINGTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDTYPEID==null?"null":BASEBUILDTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASEBUILDTYPENAME==null?"null":BASEBUILDTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASESTRUCTUREID==null?"null":BASESTRUCTUREID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BASESTRUCTURENAME==null?"null":BASESTRUCTURENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NATUREID==null?"null":NATUREID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(NATURENAME==null?"null":NATURENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HEIGHT==null?"null":HEIGHT.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ADDRESS==null?"null":ADDRESS, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(USE==null?"null":USE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILTYEAR==null?"null":BUILTYEAR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOREYABOVE==null?"null":STOREYABOVE.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(STOREYUNDER==null?"null":STOREYUNDER.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ROOMNUMBYUNITFLOOR==null?"null":ROOMNUMBYUNITFLOOR.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ROOMS==null?"null":ROOMS.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UNITNUM==null?"null":UNITNUM.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISTOILET==null?"null":ISTOILET, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISWATERMETER==null?"null":ISWATERMETER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISELECTRICMETER==null?"null":ISELECTRICMETER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISIMPORTANTPLACE==null?"null":ISIMPORTANTPLACE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(AREA==null?"null":AREA.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COORDINATEID==null?"null":COORDINATEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PHOTO==null?"null":PHOTO, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(REMARK==null?"null":REMARK, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ATTRIBUTESTR==null?"null":ATTRIBUTESTR, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATEUSER==null?"null":CREATEUSER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(CREATETIME==null?"null":"" + CREATETIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATEUSER==null?"null":UPDATEUSER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(UPDATETIME==null?"null":"" + UPDATETIME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(VERSION==null?"null":VERSION.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF1==null?"null":DF1, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF2==null?"null":DF2, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF3==null?"null":DF3, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF4==null?"null":DF4, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF5==null?"null":DF5, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF6==null?"null":DF6, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF7==null?"null":DF7, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF8==null?"null":DF8, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF9==null?"null":DF9, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DF10==null?"null":DF10, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGADMIN==null?"null":BUILDINGADMIN, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGCONTACT==null?"null":BUILDINGCONTACT, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGPOLICE==null?"null":BUILDINGPOLICE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(BUILDINGPOLICETEL==null?"null":BUILDINGPOLICETEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMANAGER==null?"null":COMMANAGER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(COMMTEL==null?"null":COMMTEL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ORGPATH==null?"null":ORGPATH, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GEOM==null?"null":GEOM, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(GID==null?"null":GID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISLOCATE==null?"null":ISLOCATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPSAMLLTYPEID==null?"null":MAPSAMLLTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPSAMLLTYPENAME==null?"null":MAPSAMLLTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPBIGTYPENAME==null?"null":MAPBIGTYPENAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MAPBIGTYPEID==null?"null":MAPBIGTYPEID.toPlainString(), delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(ISBUSINE==null?"null":ISBUSINE, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REGION = null; } else {
      this.REGION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORGID = null; } else {
      this.ORGID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORGNAME = null; } else {
      this.ORGNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GRIDID = null; } else {
      this.GRIDID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GRIDNAME = null; } else {
      this.GRIDNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUILDINGGROUPID = null; } else {
      this.BUILDINGGROUPID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGNAME = null; } else {
      this.BUILDINGNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CODENUMBER = null; } else {
      this.CODENUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NAME = null; } else {
      this.NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BASEBUILDINGTYPEID = null; } else {
      this.BASEBUILDINGTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BASEBUILDINGTYPENAME = null; } else {
      this.BASEBUILDINGTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BASEBUILDTYPEID = null; } else {
      this.BASEBUILDTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BASEBUILDTYPENAME = null; } else {
      this.BASEBUILDTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BASESTRUCTUREID = null; } else {
      this.BASESTRUCTUREID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BASESTRUCTURENAME = null; } else {
      this.BASESTRUCTURENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NATUREID = null; } else {
      this.NATUREID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NATURENAME = null; } else {
      this.NATURENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HEIGHT = null; } else {
      this.HEIGHT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRESS = null; } else {
      this.ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.USE = null; } else {
      this.USE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUILTYEAR = null; } else {
      this.BUILTYEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STOREYABOVE = null; } else {
      this.STOREYABOVE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STOREYUNDER = null; } else {
      this.STOREYUNDER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ROOMNUMBYUNITFLOOR = null; } else {
      this.ROOMNUMBYUNITFLOOR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ROOMS = null; } else {
      this.ROOMS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNITNUM = null; } else {
      this.UNITNUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISTOILET = null; } else {
      this.ISTOILET = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISWATERMETER = null; } else {
      this.ISWATERMETER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISELECTRICMETER = null; } else {
      this.ISELECTRICMETER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISIMPORTANTPLACE = null; } else {
      this.ISIMPORTANTPLACE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AREA = null; } else {
      this.AREA = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COORDINATEID = null; } else {
      this.COORDINATEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHOTO = null; } else {
      this.PHOTO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REMARK = null; } else {
      this.REMARK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ATTRIBUTESTR = null; } else {
      this.ATTRIBUTESTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREATEUSER = null; } else {
      this.CREATEUSER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CREATETIME = null; } else {
      this.CREATETIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UPDATEUSER = null; } else {
      this.UPDATEUSER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UPDATETIME = null; } else {
      this.UPDATETIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF1 = null; } else {
      this.DF1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF2 = null; } else {
      this.DF2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF3 = null; } else {
      this.DF3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF4 = null; } else {
      this.DF4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF5 = null; } else {
      this.DF5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF6 = null; } else {
      this.DF6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF7 = null; } else {
      this.DF7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF8 = null; } else {
      this.DF8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF9 = null; } else {
      this.DF9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF10 = null; } else {
      this.DF10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGADMIN = null; } else {
      this.BUILDINGADMIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGCONTACT = null; } else {
      this.BUILDINGCONTACT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGPOLICE = null; } else {
      this.BUILDINGPOLICE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGPOLICETEL = null; } else {
      this.BUILDINGPOLICETEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMANAGER = null; } else {
      this.COMMANAGER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMTEL = null; } else {
      this.COMMTEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORGPATH = null; } else {
      this.ORGPATH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GEOM = null; } else {
      this.GEOM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GID = null; } else {
      this.GID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISLOCATE = null; } else {
      this.ISLOCATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAPSAMLLTYPEID = null; } else {
      this.MAPSAMLLTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAPSAMLLTYPENAME = null; } else {
      this.MAPSAMLLTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAPBIGTYPENAME = null; } else {
      this.MAPBIGTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAPBIGTYPEID = null; } else {
      this.MAPBIGTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISBUSINE = null; } else {
      this.ISBUSINE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REGION = null; } else {
      this.REGION = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ID = null; } else {
      this.ID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ORGID = null; } else {
      this.ORGID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORGNAME = null; } else {
      this.ORGNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.GRIDID = null; } else {
      this.GRIDID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GRIDNAME = null; } else {
      this.GRIDNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUILDINGGROUPID = null; } else {
      this.BUILDINGGROUPID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGNAME = null; } else {
      this.BUILDINGNAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CODENUMBER = null; } else {
      this.CODENUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NAME = null; } else {
      this.NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BASEBUILDINGTYPEID = null; } else {
      this.BASEBUILDINGTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BASEBUILDINGTYPENAME = null; } else {
      this.BASEBUILDINGTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BASEBUILDTYPEID = null; } else {
      this.BASEBUILDTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BASEBUILDTYPENAME = null; } else {
      this.BASEBUILDTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BASESTRUCTUREID = null; } else {
      this.BASESTRUCTUREID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BASESTRUCTURENAME = null; } else {
      this.BASESTRUCTURENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.NATUREID = null; } else {
      this.NATUREID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.NATURENAME = null; } else {
      this.NATURENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.HEIGHT = null; } else {
      this.HEIGHT = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ADDRESS = null; } else {
      this.ADDRESS = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.USE = null; } else {
      this.USE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.BUILTYEAR = null; } else {
      this.BUILTYEAR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STOREYABOVE = null; } else {
      this.STOREYABOVE = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.STOREYUNDER = null; } else {
      this.STOREYUNDER = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ROOMNUMBYUNITFLOOR = null; } else {
      this.ROOMNUMBYUNITFLOOR = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.ROOMS = null; } else {
      this.ROOMS = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UNITNUM = null; } else {
      this.UNITNUM = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISTOILET = null; } else {
      this.ISTOILET = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISWATERMETER = null; } else {
      this.ISWATERMETER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISELECTRICMETER = null; } else {
      this.ISELECTRICMETER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISIMPORTANTPLACE = null; } else {
      this.ISIMPORTANTPLACE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.AREA = null; } else {
      this.AREA = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.COORDINATEID = null; } else {
      this.COORDINATEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHOTO = null; } else {
      this.PHOTO = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.REMARK = null; } else {
      this.REMARK = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ATTRIBUTESTR = null; } else {
      this.ATTRIBUTESTR = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.CREATEUSER = null; } else {
      this.CREATEUSER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.CREATETIME = null; } else {
      this.CREATETIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.UPDATEUSER = null; } else {
      this.UPDATEUSER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.UPDATETIME = null; } else {
      this.UPDATETIME = java.sql.Timestamp.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.VERSION = null; } else {
      this.VERSION = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF1 = null; } else {
      this.DF1 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF2 = null; } else {
      this.DF2 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF3 = null; } else {
      this.DF3 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF4 = null; } else {
      this.DF4 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF5 = null; } else {
      this.DF5 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF6 = null; } else {
      this.DF6 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF7 = null; } else {
      this.DF7 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF8 = null; } else {
      this.DF8 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF9 = null; } else {
      this.DF9 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.DF10 = null; } else {
      this.DF10 = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGADMIN = null; } else {
      this.BUILDINGADMIN = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGCONTACT = null; } else {
      this.BUILDINGCONTACT = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGPOLICE = null; } else {
      this.BUILDINGPOLICE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.BUILDINGPOLICETEL = null; } else {
      this.BUILDINGPOLICETEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMANAGER = null; } else {
      this.COMMANAGER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.COMMTEL = null; } else {
      this.COMMTEL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ORGPATH = null; } else {
      this.ORGPATH = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GEOM = null; } else {
      this.GEOM = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.GID = null; } else {
      this.GID = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISLOCATE = null; } else {
      this.ISLOCATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAPSAMLLTYPEID = null; } else {
      this.MAPSAMLLTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAPSAMLLTYPENAME = null; } else {
      this.MAPSAMLLTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.MAPBIGTYPENAME = null; } else {
      this.MAPBIGTYPENAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MAPBIGTYPEID = null; } else {
      this.MAPBIGTYPEID = new java.math.BigDecimal(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.ISBUSINE = null; } else {
      this.ISBUSINE = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    QueryResult o = (QueryResult) super.clone();
    o.CREATETIME = (o.CREATETIME != null) ? (java.sql.Timestamp) o.CREATETIME.clone() : null;
    o.UPDATETIME = (o.UPDATETIME != null) ? (java.sql.Timestamp) o.UPDATETIME.clone() : null;
    return o;
  }

  public void clone0(QueryResult o) throws CloneNotSupportedException {
    o.CREATETIME = (o.CREATETIME != null) ? (java.sql.Timestamp) o.CREATETIME.clone() : null;
    o.UPDATETIME = (o.UPDATETIME != null) ? (java.sql.Timestamp) o.UPDATETIME.clone() : null;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("REGION", this.REGION);
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("ORGID", this.ORGID);
    __sqoop$field_map.put("ORGNAME", this.ORGNAME);
    __sqoop$field_map.put("GRIDID", this.GRIDID);
    __sqoop$field_map.put("GRIDNAME", this.GRIDNAME);
    __sqoop$field_map.put("BUILDINGGROUPID", this.BUILDINGGROUPID);
    __sqoop$field_map.put("BUILDINGNAME", this.BUILDINGNAME);
    __sqoop$field_map.put("CODENUMBER", this.CODENUMBER);
    __sqoop$field_map.put("NAME", this.NAME);
    __sqoop$field_map.put("BASEBUILDINGTYPEID", this.BASEBUILDINGTYPEID);
    __sqoop$field_map.put("BASEBUILDINGTYPENAME", this.BASEBUILDINGTYPENAME);
    __sqoop$field_map.put("BASEBUILDTYPEID", this.BASEBUILDTYPEID);
    __sqoop$field_map.put("BASEBUILDTYPENAME", this.BASEBUILDTYPENAME);
    __sqoop$field_map.put("BASESTRUCTUREID", this.BASESTRUCTUREID);
    __sqoop$field_map.put("BASESTRUCTURENAME", this.BASESTRUCTURENAME);
    __sqoop$field_map.put("NATUREID", this.NATUREID);
    __sqoop$field_map.put("NATURENAME", this.NATURENAME);
    __sqoop$field_map.put("HEIGHT", this.HEIGHT);
    __sqoop$field_map.put("ADDRESS", this.ADDRESS);
    __sqoop$field_map.put("USE", this.USE);
    __sqoop$field_map.put("BUILTYEAR", this.BUILTYEAR);
    __sqoop$field_map.put("STOREYABOVE", this.STOREYABOVE);
    __sqoop$field_map.put("STOREYUNDER", this.STOREYUNDER);
    __sqoop$field_map.put("ROOMNUMBYUNITFLOOR", this.ROOMNUMBYUNITFLOOR);
    __sqoop$field_map.put("ROOMS", this.ROOMS);
    __sqoop$field_map.put("UNITNUM", this.UNITNUM);
    __sqoop$field_map.put("ISTOILET", this.ISTOILET);
    __sqoop$field_map.put("ISWATERMETER", this.ISWATERMETER);
    __sqoop$field_map.put("ISELECTRICMETER", this.ISELECTRICMETER);
    __sqoop$field_map.put("ISIMPORTANTPLACE", this.ISIMPORTANTPLACE);
    __sqoop$field_map.put("AREA", this.AREA);
    __sqoop$field_map.put("COORDINATEID", this.COORDINATEID);
    __sqoop$field_map.put("PHOTO", this.PHOTO);
    __sqoop$field_map.put("REMARK", this.REMARK);
    __sqoop$field_map.put("ATTRIBUTESTR", this.ATTRIBUTESTR);
    __sqoop$field_map.put("CREATEUSER", this.CREATEUSER);
    __sqoop$field_map.put("CREATETIME", this.CREATETIME);
    __sqoop$field_map.put("UPDATEUSER", this.UPDATEUSER);
    __sqoop$field_map.put("UPDATETIME", this.UPDATETIME);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("DF1", this.DF1);
    __sqoop$field_map.put("DF2", this.DF2);
    __sqoop$field_map.put("DF3", this.DF3);
    __sqoop$field_map.put("DF4", this.DF4);
    __sqoop$field_map.put("DF5", this.DF5);
    __sqoop$field_map.put("DF6", this.DF6);
    __sqoop$field_map.put("DF7", this.DF7);
    __sqoop$field_map.put("DF8", this.DF8);
    __sqoop$field_map.put("DF9", this.DF9);
    __sqoop$field_map.put("DF10", this.DF10);
    __sqoop$field_map.put("BUILDINGADMIN", this.BUILDINGADMIN);
    __sqoop$field_map.put("BUILDINGCONTACT", this.BUILDINGCONTACT);
    __sqoop$field_map.put("BUILDINGPOLICE", this.BUILDINGPOLICE);
    __sqoop$field_map.put("BUILDINGPOLICETEL", this.BUILDINGPOLICETEL);
    __sqoop$field_map.put("COMMANAGER", this.COMMANAGER);
    __sqoop$field_map.put("COMMTEL", this.COMMTEL);
    __sqoop$field_map.put("ORGPATH", this.ORGPATH);
    __sqoop$field_map.put("GEOM", this.GEOM);
    __sqoop$field_map.put("GID", this.GID);
    __sqoop$field_map.put("ISLOCATE", this.ISLOCATE);
    __sqoop$field_map.put("MAPSAMLLTYPEID", this.MAPSAMLLTYPEID);
    __sqoop$field_map.put("MAPSAMLLTYPENAME", this.MAPSAMLLTYPENAME);
    __sqoop$field_map.put("MAPBIGTYPENAME", this.MAPBIGTYPENAME);
    __sqoop$field_map.put("MAPBIGTYPEID", this.MAPBIGTYPEID);
    __sqoop$field_map.put("ISBUSINE", this.ISBUSINE);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("REGION", this.REGION);
    __sqoop$field_map.put("ID", this.ID);
    __sqoop$field_map.put("ORGID", this.ORGID);
    __sqoop$field_map.put("ORGNAME", this.ORGNAME);
    __sqoop$field_map.put("GRIDID", this.GRIDID);
    __sqoop$field_map.put("GRIDNAME", this.GRIDNAME);
    __sqoop$field_map.put("BUILDINGGROUPID", this.BUILDINGGROUPID);
    __sqoop$field_map.put("BUILDINGNAME", this.BUILDINGNAME);
    __sqoop$field_map.put("CODENUMBER", this.CODENUMBER);
    __sqoop$field_map.put("NAME", this.NAME);
    __sqoop$field_map.put("BASEBUILDINGTYPEID", this.BASEBUILDINGTYPEID);
    __sqoop$field_map.put("BASEBUILDINGTYPENAME", this.BASEBUILDINGTYPENAME);
    __sqoop$field_map.put("BASEBUILDTYPEID", this.BASEBUILDTYPEID);
    __sqoop$field_map.put("BASEBUILDTYPENAME", this.BASEBUILDTYPENAME);
    __sqoop$field_map.put("BASESTRUCTUREID", this.BASESTRUCTUREID);
    __sqoop$field_map.put("BASESTRUCTURENAME", this.BASESTRUCTURENAME);
    __sqoop$field_map.put("NATUREID", this.NATUREID);
    __sqoop$field_map.put("NATURENAME", this.NATURENAME);
    __sqoop$field_map.put("HEIGHT", this.HEIGHT);
    __sqoop$field_map.put("ADDRESS", this.ADDRESS);
    __sqoop$field_map.put("USE", this.USE);
    __sqoop$field_map.put("BUILTYEAR", this.BUILTYEAR);
    __sqoop$field_map.put("STOREYABOVE", this.STOREYABOVE);
    __sqoop$field_map.put("STOREYUNDER", this.STOREYUNDER);
    __sqoop$field_map.put("ROOMNUMBYUNITFLOOR", this.ROOMNUMBYUNITFLOOR);
    __sqoop$field_map.put("ROOMS", this.ROOMS);
    __sqoop$field_map.put("UNITNUM", this.UNITNUM);
    __sqoop$field_map.put("ISTOILET", this.ISTOILET);
    __sqoop$field_map.put("ISWATERMETER", this.ISWATERMETER);
    __sqoop$field_map.put("ISELECTRICMETER", this.ISELECTRICMETER);
    __sqoop$field_map.put("ISIMPORTANTPLACE", this.ISIMPORTANTPLACE);
    __sqoop$field_map.put("AREA", this.AREA);
    __sqoop$field_map.put("COORDINATEID", this.COORDINATEID);
    __sqoop$field_map.put("PHOTO", this.PHOTO);
    __sqoop$field_map.put("REMARK", this.REMARK);
    __sqoop$field_map.put("ATTRIBUTESTR", this.ATTRIBUTESTR);
    __sqoop$field_map.put("CREATEUSER", this.CREATEUSER);
    __sqoop$field_map.put("CREATETIME", this.CREATETIME);
    __sqoop$field_map.put("UPDATEUSER", this.UPDATEUSER);
    __sqoop$field_map.put("UPDATETIME", this.UPDATETIME);
    __sqoop$field_map.put("VERSION", this.VERSION);
    __sqoop$field_map.put("DF1", this.DF1);
    __sqoop$field_map.put("DF2", this.DF2);
    __sqoop$field_map.put("DF3", this.DF3);
    __sqoop$field_map.put("DF4", this.DF4);
    __sqoop$field_map.put("DF5", this.DF5);
    __sqoop$field_map.put("DF6", this.DF6);
    __sqoop$field_map.put("DF7", this.DF7);
    __sqoop$field_map.put("DF8", this.DF8);
    __sqoop$field_map.put("DF9", this.DF9);
    __sqoop$field_map.put("DF10", this.DF10);
    __sqoop$field_map.put("BUILDINGADMIN", this.BUILDINGADMIN);
    __sqoop$field_map.put("BUILDINGCONTACT", this.BUILDINGCONTACT);
    __sqoop$field_map.put("BUILDINGPOLICE", this.BUILDINGPOLICE);
    __sqoop$field_map.put("BUILDINGPOLICETEL", this.BUILDINGPOLICETEL);
    __sqoop$field_map.put("COMMANAGER", this.COMMANAGER);
    __sqoop$field_map.put("COMMTEL", this.COMMTEL);
    __sqoop$field_map.put("ORGPATH", this.ORGPATH);
    __sqoop$field_map.put("GEOM", this.GEOM);
    __sqoop$field_map.put("GID", this.GID);
    __sqoop$field_map.put("ISLOCATE", this.ISLOCATE);
    __sqoop$field_map.put("MAPSAMLLTYPEID", this.MAPSAMLLTYPEID);
    __sqoop$field_map.put("MAPSAMLLTYPENAME", this.MAPSAMLLTYPENAME);
    __sqoop$field_map.put("MAPBIGTYPENAME", this.MAPBIGTYPENAME);
    __sqoop$field_map.put("MAPBIGTYPEID", this.MAPBIGTYPEID);
    __sqoop$field_map.put("ISBUSINE", this.ISBUSINE);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
