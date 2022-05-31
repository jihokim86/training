package problem1_16;

import java.util.GregorianCalendar;
import java.util.GregorianCalendar.*;

public class Day {
   private int year = 1; // ��
   private int month = 1; // ��
   private int date = 1; // ��

   // ---�� ���� �ϼ� ---//
   private static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ���
         { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // ����
   };

   // ---y���� �����ΰ�?---//
   public static boolean isLeap(int y) {
      return y % 4 == 0 && y % 100 != 0 || y % 400 == 0;
   }

   // ---y��m���� �ϼ�(28/29/30/31) ---//
   private static int dayOfMonth(int y, int m) {
      return mdays[isLeap(y) ? 1 : 0][m - 1]; // false [0][i-1]
   }

   // ---������ m�� (1~12 ���� ���� ���� ����) ---//
   private static int adjustedMonth(int m) {
      return m < 1 ? 1 : m > 12 ? 12 : m;
   }

   // ---������ y��m���� d��(1~28/29/30/31 ���� ���� ���� ����)---//
   private static int adjustedDay(int y, int m, int d) {
      if (d < 1)
         return 1;
      int dmax = dayOfMonth(y, m); // y�� m���� �ϼ�
      return d > dmax ? dmax : d;
   }

   // ---������(���� ��¥)---//
   public Day() {
      GregorianCalendar today = new GregorianCalendar(); // ���� ��¥
      this.year = today.get(year); // ��
      this.month = today.get(month) + 1; // ��
      this.date = today.get(date); // ��
   }

   // ---������(year�� 1��1��)---//
   public Day(int year) {
      this.year = year;
   }

   // ---������(year�� month��1��)---//
   public Day(int year, int month) {
      this(year);
      this.month = adjustedMonth(month);
   }

   // ---������(year�� month��date��)---//
   public Day(int year, int month, int date) {
      this(year, month);
      this.date = adjustedDay(year, this.month, date);
   }

   // ---������(d�� ���� ��¥)---//
   public Day(Day d) {
      this(d.year, d.month, d.date);
   }

   // ---�� ��������---//
   public int getYear() {
      return year;
   }

   // ---�� ��������---//
   public int getMonth() {
      return month;
   }

   // ---�� ��������---//
   public int getDate() {
      return date;
   }

   // ---�� ����---//
   public void setYear(int year) {
      this.year = year; // ��
      this.date = adjustedDay(year, month, date); // �� ����
   }

   // ---�� ����---//
   public void setMonth(int month) {
      this.month = adjustedMonth(month); // �� ����
      this.date = adjustedDay(year, this.month, date); // �� ����
   }

   // ---�� ����---//
   public void setDate(int date) {
      this.date = adjustedDay(year, month, date); // �� ����
   }

   // ---��, ��, �� ����---//
   public void set(int year, int month, int date) {
      this.year = year; // ��
      this.month = adjustedMonth(month); // �� ����
      this.date = adjustedDay(year, this.month, date); // �� ����
   }

   // ---�����ΰ�---//
   public boolean isLeap() {
      return isLeap(year); // Ŭ���� �޼��� ������ isLeapȣ��
   }

   // ---���� ���ϱ�---//
   public int dayOfWeek() {
      int y = year;
      int m = month;
      if (m == 1 || m == 2) {//
         y--;
         m += 12;
      }
      return (y + y / 4 - y / 100 + y / 400 + (13 * m + 8) / 5 + date) % 7;
   }

   // ---��¥ d�� ������?---//
   public boolean equalTo(Day d) {
      return year == d.year && month == d.month && date == d.date;
   }

   public String toString() {
      String[] wd = { "��", "��", "ȭ", "��", "��", "��", "��" };
      return String.format("%04d��,%02d��%02d��(%s)", year, month, date, wd[dayOfWeek()]);
   }

   public int dayOfYear() {
      int days = date;
      for (int i = 1; i < month; i++)
         days += dayOfMonth(year, i); // day = day+dayOfMonth(2022,i)
      return days;
   }

   public int leftDayOfYear() {
      return 365 + (isLeap(year) ? 1 : 0) - dayOfYear();
   }

   public int compareTo(Day d) {
      return compare(this, d);
   }

   public static int compare(Day d1, Day d2) {
      if (d1.year > d2.year)
         return 1;
      if (d1.year > d2.year)
         return -1;

      if (d1.month > d2.month)
         return 1;
      if (d1.month > d2.month)
         return -1;

      return d1.date > d2.date ? 1 : d1.date < d2.date ? -1 : 0;
   }

   public void succeed() {
      if (date < dayOfMonth(year, month))
         date++;
      else {
         if (++month > 12) {
            year++;
            month = 1;
         }
         date = 1;
      }
   }

   public Day succeedingDay() {
      Day temp = new Day(this);
      temp.succeed();
      return temp;
   }

   public void precede() {
      if (date > 1)
         date--;
      else {
         if (--month < 1) {
            year--;
            month = 12;
         }
         date = dayOfMonth(year, month);
      }
   }

   public Day precedingDay() {
      Day temp = new Day(this);
      temp.precede();
      return temp;
   }

   public void succeedDays(int n) {
      if (n < 0) {
         date += n;
         while (date > dayOfMonth(year, month)) {
            date -= dayOfMonth(year, month);
            if (++month > 12) {
               year++;
               month = 1;
            }
         }
      }
   }

   public Day after(int n) {
      Day temp = new Day(this);
      temp.succeedDays(n);
      return temp;
   }

   public void precedeDays(int n) {
      if (n < 0)
         succeedDays(-n);
      else if (n > 0) {
         date -= n;
         while (date < 1) {
            if (--month < 1) {
               year--;
               month = 12;
            }
            date += dayOfMonth(year, month);
         }
      }
   }

   public Day before(int n) {
      Day temp = new Day(this);
      temp.precedeDays(n);
      return temp;
   }
}