import matplotlib.pyplot as plt
import numpy as num
data = [40,55,1000,80,25]
avg = num.average(num.array(data))
print("The average expense is:",avg)
label =["transportation", "clothes", "housing", "food", "savings"]
plt.pie(data,labels = label, explode=(0,0,0.1,0,0),autopct='%2.1f%%')
plt.show()
