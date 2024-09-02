package com.techacademy;

import java.util.Calendar;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {	
	
	@GetMapping("/dayofweek/{date}")
	public String dispDayOfWeek (@PathVariable String date) {
		
		String year = date.substring(0,4);
		String month = date.substring(4,6);
		String day = date.substring(6,8);
		
		int yearInt = Integer.parseInt(year);
		int monthInt = Integer.parseInt(month) - 1;
		int dayInt = Integer.parseInt(day);
		
		Calendar calendar = Calendar.getInstance();
        calendar.set(yearInt, monthInt, dayInt); 
        
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        
        String dayName;
        switch (dayOfWeek) {
            case Calendar.SUNDAY:
                dayName = "Sunday";
                break;
            case Calendar.MONDAY:
                dayName = "Monday";
                break;
            case Calendar.TUESDAY:
                dayName = "Tuesday";
                break;
            case Calendar.WEDNESDAY:
                dayName = "Wednesday";
                break;
            case Calendar.THURSDAY:
                dayName = "Thursday";
                break;
            case Calendar.FRIDAY:
                dayName = "Friday";
                break;
            case Calendar.SATURDAY:
                dayName = "Saturday";
                break;
            default:
                dayName = "Unknown";
                break;
        }

        return dayName;
	}
        
        @GetMapping("/plus/{val1}/{val2}")
        public String calcPlus(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 + val2;
            return "計算結果：" + res;
	}
        @GetMapping("/minus/{val1}/{val2}")
        public String calcMinus(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 - val2;
            return "計算結果：" + res;
        }
        @GetMapping("/times/{val1}/{val2}")
        public String calcTimes(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 * val2;
            return "計算結果：" + res;
   	
            }
        @GetMapping("/divide/{val1}/{val2}")
        public String calcDivide(@PathVariable int val1, @PathVariable int val2) {
            int res = 0;
            res = val1 / val2;
            return "計算結果：" + res;

}
}
