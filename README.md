# Music Visualiser Project

Name: Max Pocock

Student Number: C19323561

# Description of the assignment
This assignment "Something beautiful to enjoy while listening to music" had me thinking for a long time on what I wanted to create. I decided on a very simplistic and minimalist design. Personally when I am listening to music I prefer a simple visual, I hate the overly complicated visualizers with loads going on. The first visual is a simple spectrum with an appealing background. The spectrum is on the horizon, the top half is purple and the bottom is orange to somewhat resemble a sunset. The next one is a visual with raindrops falling. The raindrops change colour according to the music, the spawning of raindrops is in random x and y coordinates with varying speed. The final visual is a circle which changes radius and colour depending on the music. The circle is also draggable.

[![YouTube](http://img.youtube.com/vi/ORiBYJrj0d0/0.jpg)](https://www.youtube.com/watch?v=ORiBYJrj0d0)

# Instructions
Pressing the spacebar starts and restarts the music. Pressing 1 will bring you to sunset, 2 is rain and 3 is ball. When in ball if you press and drag your mouse the ball will follow and remain stationary when released. Click the mouse without moving it and the ball will start moving by itself again. Clicking the mouse will change the direction and speed of the ball.

# How it works
THe sunset is a basic spectrum which works by using the audiobuffer ,from the minim library, to alter the y coordinates with the music. The audio buffer returns a float between 0 and 1, this value is then multiplied by the y value to get the new y value. 

The rain works by using a loop to call the rain method multiple times. Rain gets it's variables from the ProjectObject superclass. The render method draws the raindrop shape and the update method is responsible for moving the raindrops and moving them to the top of the screen when they go off the bottom of the screen. They also change colour with the music by using the map function to map the smoothedAmplitude between 255 and 0 for the red value of the fill RGB colour.

The ball is drawn using a matrix. The circle's diameter uses the map function to map the amplitude from 0 to 300. This makes the circle change size. The map function is also used to change the colour. There is also some if statements which stop the ball from leaving the window. A mouseDragged method is used to move the circle to mouseX and mouseY coordinates. MouseClicked gives the ball a new direction and speed.

The selection is controled with a keyPressed method and a switch with options 1, 2 or 3.

# What I am most proud of in the assignment
The part I am most proud of  is the ball visual. A lot of thinking went into making sure the ball could not leave the window as well as making the ball interactive. Mouse controls took me a while to implement, but the satisfaction of finally getting them to work was truly wonderful. I was very glad that I figured out a way to change the speed and direction and also to drag the ball and make it stay where you dragged it. Overall I am very proud of this assignment as I believe it really is something interactive and beautiful to enjoy while listening to music.

# Markdown Tutorial

This is *emphasis*

This is a bulleted list

- Item
- Item

This is a numbered list

1. Item
1. Item

This is a [hyperlink](http://bryanduggan.org)

# Headings
## Headings
#### Headings
##### Headings

This is code:

```Java
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

So is this without specifying the language:

```
public void render()
{
	ui.noFill();
	ui.stroke(255);
	ui.rect(x, y, width, height);
	ui.textAlign(PApplet.CENTER, PApplet.CENTER);
	ui.text(text, x + width * 0.5f, y + height * 0.5f);
}
```

This is an image using a relative URL:

![An image](images/p8.png)

This is an image using an absolute URL:

![A different image](https://bryanduggandotorg.files.wordpress.com/2019/02/infinite-forms-00045.png?w=595&h=&zoom=2)

This is a youtube video:

[![YouTube](http://img.youtube.com/vi/J2kHSSFA4NU/0.jpg)](https://www.youtube.com/watch?v=J2kHSSFA4NU)

This is a table:

| Heading 1 | Heading 2 |
|-----------|-----------|
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |
|Some stuff | Some more stuff in this column |

