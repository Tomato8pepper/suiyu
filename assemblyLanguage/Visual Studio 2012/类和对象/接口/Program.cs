using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace 接口
{
    interface IRemote
    {
        string Type { get; set; }
        bool powerOn(bool b);
        int volumeUp(int i);
        int volumnDown(int d);
        void mute();
    }
    class DVDRemote : IRemote
    {
        string type = "DVD";

        public string Type
        {
            get { return type; }
            set { type = value; }
        }
        protected bool power;
        int volume;
        public DVDRemote() { }
        public bool powerOn(bool b)
        {
            this.power = b;
            Console.WriteLine(type + "电源状态:" + (this.power ? "开" : "关"));
            return this.power;
        }
        public int volumnDown(int d)
        {
            if (!this.power)
                return 0;
            Console.WriteLine(type + "音量减少为：" + this.volume);
            return this.volume;
        }
        public int volumeUp(int i)
        {
            if(!this.power )
               return 0;
            this .volume +=i;
            Console .WriteLine (type+"音量增大为："+this.volume );
            return this.volume ;
        }
        public void mute()
        {
            if (!this.power)
                return;
            Console.WriteLine(type + "处于静音状态");
            return ;
        }
    }
    class TVRemote : DVDRemote, IRemote
    {
        const int channeImin = 0;
        const int channelmax = 999;
        int channel;
        public TVRemote(string type)
        {
            this.Type = type;
        }
        public int channelDown()
        {
            if (!this.power)
                return 0;
            if (this.channel > channeImin)
            {
                this.channel--;
            }
            else
            {
                this.channel = channelmax;
            }
            return this.channel;
        }
        public int channelUp()
        {
            if (!this.power)
                return 0;
            if (this.channel < channelmax)
            {
                this.channel++;
            }
            else
            {
                this.channel =channeImin ;
            }
            return this.channel;
        }
        public void setChannel(int c)
        {
            if (!this.power)
                return;
            this.channel = c;
            Console.WriteLine("当前选中的是{0}频道", this.channel);
        }
    }
    
    class Program
    {
        static void Main(string[] args)
        {
            IRemote ir;
            TVRemote tv = new TVRemote("电视机");
            ir = tv;
            ir.powerOn(true);
            ir.volumnDown(20);
            ir.volumeUp(50);
            tv.setChannel(70);
            Console.WriteLine("当前频道为" + tv.channelDown());
            Console.WriteLine("当前频道为" + tv.channelUp());
            DVDRemote dvd = new DVDRemote();
            ir = dvd;
            ir.powerOn(true);
            ir.volumnDown(80);
            ir.volumeUp(40);
            Console.Read();
        }
    }
}
