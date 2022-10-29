import math

listed = []
start = 0
target = 8

for x in range (1024):
    listed.append(x)

end = len(listed)-1

def  binarySearch(listed, start, end, target):
   if(start>end):return False
   mid = math.floor((start+end)/2)
   if(listed[mid]==target):return True
   if(listed[mid]>target): return binarySearch(listed, start, mid -1, target)
   else: return binarySearch(listed, mid +1, end, target)

print(binarySearch(listed, start, end, target))
