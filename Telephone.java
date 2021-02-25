import java.io.*;
import java.sql.*;
import java.lang.*;
class Telephone
{
		public static void main(String[] args)throws IOException
		{
		String ch,n,s,tnam,addr;
		int flag=0;
		DataInputStream in=new DataInputStream(System.in);
		Connection con;
		Statement stm;
		ResultSet res;
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:odbc:msdtel","","");
			System.out.println("enter begining letter");
			ch=in.readLine();
			s="select * from tel where tname link'"+ch+"%'";
			stm=con.createStatement();
			res=stm.executeQuesry(s);
			while(res.next())
			{
				flag=1;
				n=res.getString(2);
				tnam=res.getString(3);
				addr=res.getString(4);
				System.out.println("telephone nbr"+n);
				System.out.println("name"+tnam);
				System.out.println("adr"+addr);
			}
			if(flag==0)
			{
				System.out.println("no such record");
			}
			res.close();
				stm.close();
					con.close();
			catch(Exception e){}
		}
	}
