package CLOCK;

public class clock 
{
	public String clock(String s)
	{
		String a[]=s.split(":");
		String hour=a[0];
		String min=a[1];
		String sec=a[2].substring(0,a[2].length()-2);
		String ampm=a[2].substring(a[2].length()-2);
	
		int hh=Integer.parseInt(hour);
		String NewTime="";
		if((hh>0 && hh<12) && (ampm.equalsIgnoreCase("AM")))
		{
			NewTime = String.format("%02d",hh)+":"+min+":"+sec;
		}
		else if ((hh>0 && hh<12)&& (ampm.equalsIgnoreCase("PM")))
		{
			NewTime=(12+hh)+":"+min+":"+sec;
			
		}
		else if((hh==12)&& (ampm.equalsIgnoreCase("PM")))
				{
			NewTime=hh+":"+min+":"+sec;
			
				}
		else
		{
			NewTime="00"+":"+min+":"+sec;
			
		}
	return NewTime;
	}


}
