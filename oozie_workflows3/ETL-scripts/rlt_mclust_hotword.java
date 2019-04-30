// ORM class for table 'rlt_mclust_hotword'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Wed Jun 27 18:39:04 CST 2018
// For connector: org.apache.sqoop.manager.MySQLManager
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

public class rlt_mclust_hotword extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  public static interface FieldSetterCommand {    void setField(Object value);  }  protected ResultSet __cur_result_set;
  private Map<String, FieldSetterCommand> setters = new HashMap<String, FieldSetterCommand>();
  private void init0() {
    setters.put("rownames", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        rownames = (String)value;
      }
    });
    setters.put("orgid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        orgid = (String)value;
      }
    });
    setters.put("class_index", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        class_index = (String)value;
      }
    });
    setters.put("center_xy", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        center_xy = (String)value;
      }
    });
    setters.put("term", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        term = (String)value;
      }
    });
    setters.put("bigtypeid", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        bigtypeid = (String)value;
      }
    });
    setters.put("date", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        date = (String)value;
      }
    });
    setters.put("counttype", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        counttype = (String)value;
      }
    });
    setters.put("count", new FieldSetterCommand() {
      @Override
      public void setField(Object value) {
        count = (String)value;
      }
    });
  }
  public rlt_mclust_hotword() {
    init0();
  }
  private String rownames;
  public String get_rownames() {
    return rownames;
  }
  public void set_rownames(String rownames) {
    this.rownames = rownames;
  }
  public rlt_mclust_hotword with_rownames(String rownames) {
    this.rownames = rownames;
    return this;
  }
  private String orgid;
  public String get_orgid() {
    return orgid;
  }
  public void set_orgid(String orgid) {
    this.orgid = orgid;
  }
  public rlt_mclust_hotword with_orgid(String orgid) {
    this.orgid = orgid;
    return this;
  }
  private String class_index;
  public String get_class_index() {
    return class_index;
  }
  public void set_class_index(String class_index) {
    this.class_index = class_index;
  }
  public rlt_mclust_hotword with_class_index(String class_index) {
    this.class_index = class_index;
    return this;
  }
  private String center_xy;
  public String get_center_xy() {
    return center_xy;
  }
  public void set_center_xy(String center_xy) {
    this.center_xy = center_xy;
  }
  public rlt_mclust_hotword with_center_xy(String center_xy) {
    this.center_xy = center_xy;
    return this;
  }
  private String term;
  public String get_term() {
    return term;
  }
  public void set_term(String term) {
    this.term = term;
  }
  public rlt_mclust_hotword with_term(String term) {
    this.term = term;
    return this;
  }
  private String bigtypeid;
  public String get_bigtypeid() {
    return bigtypeid;
  }
  public void set_bigtypeid(String bigtypeid) {
    this.bigtypeid = bigtypeid;
  }
  public rlt_mclust_hotword with_bigtypeid(String bigtypeid) {
    this.bigtypeid = bigtypeid;
    return this;
  }
  private String date;
  public String get_date() {
    return date;
  }
  public void set_date(String date) {
    this.date = date;
  }
  public rlt_mclust_hotword with_date(String date) {
    this.date = date;
    return this;
  }
  private String counttype;
  public String get_counttype() {
    return counttype;
  }
  public void set_counttype(String counttype) {
    this.counttype = counttype;
  }
  public rlt_mclust_hotword with_counttype(String counttype) {
    this.counttype = counttype;
    return this;
  }
  private String count;
  public String get_count() {
    return count;
  }
  public void set_count(String count) {
    this.count = count;
  }
  public rlt_mclust_hotword with_count(String count) {
    this.count = count;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rlt_mclust_hotword)) {
      return false;
    }
    rlt_mclust_hotword that = (rlt_mclust_hotword) o;
    boolean equal = true;
    equal = equal && (this.rownames == null ? that.rownames == null : this.rownames.equals(that.rownames));
    equal = equal && (this.orgid == null ? that.orgid == null : this.orgid.equals(that.orgid));
    equal = equal && (this.class_index == null ? that.class_index == null : this.class_index.equals(that.class_index));
    equal = equal && (this.center_xy == null ? that.center_xy == null : this.center_xy.equals(that.center_xy));
    equal = equal && (this.term == null ? that.term == null : this.term.equals(that.term));
    equal = equal && (this.bigtypeid == null ? that.bigtypeid == null : this.bigtypeid.equals(that.bigtypeid));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.counttype == null ? that.counttype == null : this.counttype.equals(that.counttype));
    equal = equal && (this.count == null ? that.count == null : this.count.equals(that.count));
    return equal;
  }
  public boolean equals0(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof rlt_mclust_hotword)) {
      return false;
    }
    rlt_mclust_hotword that = (rlt_mclust_hotword) o;
    boolean equal = true;
    equal = equal && (this.rownames == null ? that.rownames == null : this.rownames.equals(that.rownames));
    equal = equal && (this.orgid == null ? that.orgid == null : this.orgid.equals(that.orgid));
    equal = equal && (this.class_index == null ? that.class_index == null : this.class_index.equals(that.class_index));
    equal = equal && (this.center_xy == null ? that.center_xy == null : this.center_xy.equals(that.center_xy));
    equal = equal && (this.term == null ? that.term == null : this.term.equals(that.term));
    equal = equal && (this.bigtypeid == null ? that.bigtypeid == null : this.bigtypeid.equals(that.bigtypeid));
    equal = equal && (this.date == null ? that.date == null : this.date.equals(that.date));
    equal = equal && (this.counttype == null ? that.counttype == null : this.counttype.equals(that.counttype));
    equal = equal && (this.count == null ? that.count == null : this.count.equals(that.count));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.rownames = JdbcWritableBridge.readString(1, __dbResults);
    this.orgid = JdbcWritableBridge.readString(2, __dbResults);
    this.class_index = JdbcWritableBridge.readString(3, __dbResults);
    this.center_xy = JdbcWritableBridge.readString(4, __dbResults);
    this.term = JdbcWritableBridge.readString(5, __dbResults);
    this.bigtypeid = JdbcWritableBridge.readString(6, __dbResults);
    this.date = JdbcWritableBridge.readString(7, __dbResults);
    this.counttype = JdbcWritableBridge.readString(8, __dbResults);
    this.count = JdbcWritableBridge.readString(9, __dbResults);
  }
  public void readFields0(ResultSet __dbResults) throws SQLException {
    this.rownames = JdbcWritableBridge.readString(1, __dbResults);
    this.orgid = JdbcWritableBridge.readString(2, __dbResults);
    this.class_index = JdbcWritableBridge.readString(3, __dbResults);
    this.center_xy = JdbcWritableBridge.readString(4, __dbResults);
    this.term = JdbcWritableBridge.readString(5, __dbResults);
    this.bigtypeid = JdbcWritableBridge.readString(6, __dbResults);
    this.date = JdbcWritableBridge.readString(7, __dbResults);
    this.counttype = JdbcWritableBridge.readString(8, __dbResults);
    this.count = JdbcWritableBridge.readString(9, __dbResults);
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
    JdbcWritableBridge.writeString(rownames, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(orgid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(class_index, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(center_xy, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(term, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bigtypeid, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(counttype, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(count, 9 + __off, 12, __dbStmt);
    return 9;
  }
  public void write0(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeString(rownames, 1 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(orgid, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(class_index, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(center_xy, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(term, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(bigtypeid, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(date, 7 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(counttype, 8 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(count, 9 + __off, 12, __dbStmt);
  }
  public void readFields(DataInput __dataIn) throws IOException {
this.readFields0(__dataIn);  }
  public void readFields0(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.rownames = null;
    } else {
    this.rownames = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.orgid = null;
    } else {
    this.orgid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.class_index = null;
    } else {
    this.class_index = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.center_xy = null;
    } else {
    this.center_xy = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.term = null;
    } else {
    this.term = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.bigtypeid = null;
    } else {
    this.bigtypeid = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.date = null;
    } else {
    this.date = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.counttype = null;
    } else {
    this.counttype = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.count = null;
    } else {
    this.count = Text.readString(__dataIn);
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.rownames) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rownames);
    }
    if (null == this.orgid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, orgid);
    }
    if (null == this.class_index) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, class_index);
    }
    if (null == this.center_xy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, center_xy);
    }
    if (null == this.term) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, term);
    }
    if (null == this.bigtypeid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bigtypeid);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.counttype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, counttype);
    }
    if (null == this.count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, count);
    }
  }
  public void write0(DataOutput __dataOut) throws IOException {
    if (null == this.rownames) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, rownames);
    }
    if (null == this.orgid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, orgid);
    }
    if (null == this.class_index) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, class_index);
    }
    if (null == this.center_xy) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, center_xy);
    }
    if (null == this.term) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, term);
    }
    if (null == this.bigtypeid) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, bigtypeid);
    }
    if (null == this.date) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, date);
    }
    if (null == this.counttype) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, counttype);
    }
    if (null == this.count) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, count);
    }
  }
  private static final DelimiterSet __outputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    __sb.append(FieldFormatter.escapeAndEnclose(rownames==null?"null":rownames, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(orgid==null?"null":orgid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(class_index==null?"null":class_index, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(center_xy==null?"null":center_xy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(term==null?"null":term, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bigtypeid==null?"null":bigtypeid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(counttype==null?"null":counttype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(count==null?"null":count, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  public void toString0(DelimiterSet delimiters, StringBuilder __sb, char fieldDelim) {
    __sb.append(FieldFormatter.escapeAndEnclose(rownames==null?"null":rownames, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(orgid==null?"null":orgid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(class_index==null?"null":class_index, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(center_xy==null?"null":center_xy, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(term==null?"null":term, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(bigtypeid==null?"null":bigtypeid, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(date==null?"null":date, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(counttype==null?"null":counttype, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(count==null?"null":count, delimiters));
  }
  private static final DelimiterSet __inputDelimiters = new DelimiterSet((char) 1, (char) 10, (char) 0, (char) 0, false);
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
    if (__cur_str.equals("null")) { this.rownames = null; } else {
      this.rownames = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.orgid = null; } else {
      this.orgid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.class_index = null; } else {
      this.class_index = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.center_xy = null; } else {
      this.center_xy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.term = null; } else {
      this.term = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bigtypeid = null; } else {
      this.bigtypeid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.counttype = null; } else {
      this.counttype = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.count = null; } else {
      this.count = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  private void __loadFromFields0(Iterator<String> __it) {
    String __cur_str = null;
    try {
    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.rownames = null; } else {
      this.rownames = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.orgid = null; } else {
      this.orgid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.class_index = null; } else {
      this.class_index = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.center_xy = null; } else {
      this.center_xy = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.term = null; } else {
      this.term = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.bigtypeid = null; } else {
      this.bigtypeid = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.date = null; } else {
      this.date = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.counttype = null; } else {
      this.counttype = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.count = null; } else {
      this.count = __cur_str;
    }

    } catch (RuntimeException e) {    throw new RuntimeException("Can't parse input data: '" + __cur_str + "'", e);    }  }

  public Object clone() throws CloneNotSupportedException {
    rlt_mclust_hotword o = (rlt_mclust_hotword) super.clone();
    return o;
  }

  public void clone0(rlt_mclust_hotword o) throws CloneNotSupportedException {
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new HashMap<String, Object>();
    __sqoop$field_map.put("rownames", this.rownames);
    __sqoop$field_map.put("orgid", this.orgid);
    __sqoop$field_map.put("class_index", this.class_index);
    __sqoop$field_map.put("center_xy", this.center_xy);
    __sqoop$field_map.put("term", this.term);
    __sqoop$field_map.put("bigtypeid", this.bigtypeid);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("counttype", this.counttype);
    __sqoop$field_map.put("count", this.count);
    return __sqoop$field_map;
  }

  public void getFieldMap0(Map<String, Object> __sqoop$field_map) {
    __sqoop$field_map.put("rownames", this.rownames);
    __sqoop$field_map.put("orgid", this.orgid);
    __sqoop$field_map.put("class_index", this.class_index);
    __sqoop$field_map.put("center_xy", this.center_xy);
    __sqoop$field_map.put("term", this.term);
    __sqoop$field_map.put("bigtypeid", this.bigtypeid);
    __sqoop$field_map.put("date", this.date);
    __sqoop$field_map.put("counttype", this.counttype);
    __sqoop$field_map.put("count", this.count);
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if (!setters.containsKey(__fieldName)) {
      throw new RuntimeException("No such field:"+__fieldName);
    }
    setters.get(__fieldName).setField(__fieldVal);
  }

}
